-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: arrow
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `catalogo_cliente`
--

DROP TABLE IF EXISTS `catalogo_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activo` tinyint(1) DEFAULT '0',
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `contrasena` varchar(255) DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_nacimiento` datetime DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `limite_credito` decimal(19,4) DEFAULT NULL,
  `linea_credito` tinyint(1) DEFAULT '0',
  `nombre` varchar(255) DEFAULT NULL,
  `telefono_casa` varchar(255) DEFAULT NULL,
  `telefono_celular` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `facebook` varchar(1024) DEFAULT NULL,
  `twitter` varchar(1024) DEFAULT NULL,
  `instagram` varchar(1024) DEFAULT NULL,
  `whatsapp` varchar(1024) DEFAULT NULL,
  `youtube` varchar(1024) DEFAULT NULL,
  `otros` varchar(1024) DEFAULT NULL,
  `ultima_sucursal` int(11) DEFAULT NULL,
  `notas` text,
  `publicidad_enterado` tinyint(1) DEFAULT '0',
  `precio` varchar(1024) DEFAULT NULL,
  `latitud` float(10,6) DEFAULT NULL,
  `longitud` float(10,6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_cliente`
--

LOCK TABLES `catalogo_cliente` WRITE;
/*!40000 ALTER TABLE `catalogo_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_imagenes_producto`
--

DROP TABLE IF EXISTS `catalogo_imagenes_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_imagenes_producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `foto_producto` blob NOT NULL,
  `extension` varchar(45) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `id_servicio` int(11) DEFAULT NULL,
  `tenant` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_imagenes_producto`
--

LOCK TABLES `catalogo_imagenes_producto` WRITE;
/*!40000 ALTER TABLE `catalogo_imagenes_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_imagenes_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_perfil_usuario`
--

DROP TABLE IF EXISTS `catalogo_perfil_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_perfil_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '0',
  `descripcion` varchar(255) DEFAULT NULL,
  `perfil` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_perfil_usuario`
--

LOCK TABLES `catalogo_perfil_usuario` WRITE;
/*!40000 ALTER TABLE `catalogo_perfil_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_perfil_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_productos`
--

DROP TABLE IF EXISTS `catalogo_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alto` decimal(19,4) DEFAULT NULL,
  `ancho` decimal(19,4) DEFAULT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `largo` decimal(19,4) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `peso` decimal(19,4) DEFAULT NULL,
  `stock` decimal(19,4) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `proveedor` int(11) DEFAULT NULL,
  `codigo_personalizado` varchar(124) DEFAULT NULL,
  `precio` decimal(19,4) DEFAULT NULL,
  `precio_variable` tinyint(1) DEFAULT '0',
  `numeroUsos` decimal(19,4) DEFAULT NULL,
  `clave` varchar(256) DEFAULT NULL,
  `caja` varchar(256) DEFAULT NULL,
  `master` varchar(256) DEFAULT NULL,
  `unidad` varchar(256) DEFAULT NULL,
  `ean` varchar(256) DEFAULT NULL,
  `precio_minimo_venta` decimal(19,4) DEFAULT '0.0000',
  `alta_rotacion` tinyint(1) DEFAULT '0',
  `precio_mayoreo_iva` decimal(19,4) DEFAULT '0.0000',
  `precio_distribuidor_iva` decimal(19,4) DEFAULT '0.0000',
  `precio_publico_iva` decimal(19,4) DEFAULT '0.0000',
  `precio_mayoreo_siniva` decimal(19,4) DEFAULT '0.0000',
  `precio_distribuidor_siniva` decimal(19,4) DEFAULT '0.0000',
  `precio_publico_siniva` decimal(19,4) DEFAULT '0.0000',
  `marca` varchar(255) DEFAULT NULL,
  `precio_subdistribuidor_siniva` decimal(19,4) DEFAULT '0.0000',
  `precio_subdistribuidor_iva` decimal(19,4) DEFAULT NULL,
  `catalogo_productoscol` varchar(45) DEFAULT NULL,
  `porcentajeUso` decimal(19,4) DEFAULT NULL,
  `codigo_entrada_almacen_masivo` varchar(255) DEFAULT NULL,
  `numero_entrada_almacen_masivo` decimal(19,4) DEFAULT NULL,
  `regimen_fiscal` int(11) DEFAULT NULL,
  `usucfdi _cfdi_regimen_fiscal` int(11) DEFAULT NULL,
  `impuesto_trasladado` int(11) DEFAULT NULL,
  `tipo_factor_trasladado` int(11) DEFAULT NULL,
  `tasa_cuota_trasladado` int(11) DEFAULT NULL,
  `impuesto_retenido` int(11) DEFAULT NULL,
  `tipo_factor_retenido` int(11) DEFAULT NULL,
  `tasa_cuota_retenido` int(11) DEFAULT NULL,
  `iva` decimal(19,4) DEFAULT NULL,
  `isr` decimal(19,4) DEFAULT NULL,
  `ieps` decimal(19,4) DEFAULT NULL,
  `tipo_factor` varchar(50) DEFAULT NULL,
  `clave_producto_servicio` varchar(250) DEFAULT NULL,
  `clave_unidad` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_productos`
--

LOCK TABLES `catalogo_productos` WRITE;
/*!40000 ALTER TABLE `catalogo_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_promociones`
--

DROP TABLE IF EXISTS `catalogo_promociones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_promociones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `id_tipo_promocion` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `valor` decimal(19,4) DEFAULT NULL,
  `precioMinimoAplicable` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_promociones`
--

LOCK TABLES `catalogo_promociones` WRITE;
/*!40000 ALTER TABLE `catalogo_promociones` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_promociones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_proveedores`
--

DROP TABLE IF EXISTS `catalogo_proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_proveedores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `usuario_registra` int(11) DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `telefono1` varchar(256) DEFAULT NULL,
  `direccion1` varchar(256) DEFAULT NULL,
  `telefono2` varchar(256) DEFAULT NULL,
  `direccion2` varchar(256) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT NULL,
  `nombre_contacto` text,
  `correo1` text,
  `correo2` text,
  `notas` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_proveedores`
--

LOCK TABLES `catalogo_proveedores` WRITE;
/*!40000 ALTER TABLE `catalogo_proveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_servicios`
--

DROP TABLE IF EXISTS `catalogo_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `tiempo_duracion` decimal(19,4) DEFAULT NULL,
  `codigo` varchar(128) DEFAULT NULL,
  `precio` decimal(19,4) DEFAULT NULL,
  `definir_productos_en_venta` tinyint(1) DEFAULT NULL,
  `precio_variable` tinyint(1) DEFAULT NULL,
  `iva` decimal(19,4) DEFAULT NULL,
  `isr` decimal(19,4) DEFAULT NULL,
  `ieps` varchar(11) DEFAULT NULL,
  `tipo_factor` varchar(50) DEFAULT NULL,
  `clave_producto_servicio` varchar(250) DEFAULT NULL,
  `clave_unidad` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_servicios`
--

LOCK TABLES `catalogo_servicios` WRITE;
/*!40000 ALTER TABLE `catalogo_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_sucursales`
--

DROP TABLE IF EXISTS `catalogo_sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_sucursales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activo` tinyint(1) DEFAULT '0',
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `folio` int(11) DEFAULT NULL,
  `lunes_hora_inicio` datetime DEFAULT NULL,
  `lunes_hora_fin` datetime DEFAULT NULL,
  `martes_hora_inicio` datetime DEFAULT NULL,
  `martes_hora_fin` datetime DEFAULT NULL,
  `miercoles_hora_inicio` datetime DEFAULT NULL,
  `miercoles__hora_fin` datetime DEFAULT NULL,
  `jueves__hora_inicio` datetime DEFAULT NULL,
  `jueves__hora_fin` datetime DEFAULT NULL,
  `viernes_hora_inicio` datetime DEFAULT NULL,
  `viernes__hora_fin` datetime DEFAULT NULL,
  `sabado__hora_inicio` datetime DEFAULT NULL,
  `sabado__hora_fin` datetime DEFAULT NULL,
  `dominfo_hora_inicio` datetime DEFAULT NULL,
  `dominfo_hora_fin` datetime DEFAULT NULL,
  `telefono1` varchar(256) DEFAULT NULL,
  `telefono2` varchar(256) DEFAULT NULL,
  `direccion` varchar(256) DEFAULT NULL,
  `facebook` varchar(512) DEFAULT NULL,
  `twitter` varchar(512) DEFAULT NULL,
  `instagram` varchar(512) DEFAULT NULL,
  `whatsapp` varchar(512) DEFAULT NULL,
  `youtube` varchar(512) DEFAULT NULL,
  `otros` varchar(512) DEFAULT NULL,
  `monto_limite` decimal(19,4) DEFAULT NULL,
  `id_cliente_defecto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_sucursales`
--

LOCK TABLES `catalogo_sucursales` WRITE;
/*!40000 ALTER TABLE `catalogo_sucursales` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_usuario`
--

DROP TABLE IF EXISTS `catalogo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `domicilio` varchar(255) DEFAULT NULL,
  `estatus` tinyint(1) DEFAULT '0',
  `nombre` varchar(255) DEFAULT NULL,
  `ruta_foto` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `perfil_usuario` int(11) DEFAULT NULL,
  `curp` varchar(128) DEFAULT NULL,
  `rfc` varchar(128) DEFAULT NULL,
  `fecha_ingreso` datetime DEFAULT NULL,
  `notas` text,
  `ganancia` decimal(19,4) DEFAULT NULL,
  `es_operativa` tinyint(1) DEFAULT NULL,
  `numero_contacto_emerjencia` varchar(256) DEFAULT NULL,
  `nombre_contacto_emergencia` varchar(256) DEFAULT NULL,
  `numero_seguro_social` varchar(256) DEFAULT NULL,
  `salario_fijo` decimal(19,4) DEFAULT NULL,
  `vales` decimal(19,4) DEFAULT NULL,
  `honorarios` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_usuario`
--

LOCK TABLES `catalogo_usuario` WRITE;
/*!40000 ALTER TABLE `catalogo_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo_vehiculos`
--

DROP TABLE IF EXISTS `catalogo_vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo_vehiculos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notas` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `modelo` varchar(128) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `vin` varchar(256) DEFAULT NULL,
  `color` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo_vehiculos`
--

LOCK TABLES `catalogo_vehiculos` WRITE;
/*!40000 ALTER TABLE `catalogo_vehiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo_vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias_producto`
--

DROP TABLE IF EXISTS `categorias_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias_producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(256) DEFAULT NULL,
  `estatus` varchar(256) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `tenant` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias_producto`
--

LOCK TABLES `categorias_producto` WRITE;
/*!40000 ALTER TABLE `categorias_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codigo_entrada_masiva_almacen`
--

DROP TABLE IF EXISTS `codigo_entrada_masiva_almacen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `codigo_entrada_masiva_almacen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_registro` datetime NOT NULL,
  `tenant` int(11) NOT NULL,
  `codigo_masivo` varchar(255) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `cantidad` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codigo_entrada_masiva_almacen`
--

LOCK TABLES `codigo_entrada_masiva_almacen` WRITE;
/*!40000 ALTER TABLE `codigo_entrada_masiva_almacen` DISABLE KEYS */;
/*!40000 ALTER TABLE `codigo_entrada_masiva_almacen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configuracion_informacion_empresa`
--

DROP TABLE IF EXISTS `configuracion_informacion_empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracion_informacion_empresa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_empresa` varchar(250) NOT NULL,
  `direccion_empresa` varchar(512) NOT NULL,
  `tenant` int(11) NOT NULL,
  `facebook` varchar(75) DEFAULT NULL,
  `instagram` varchar(75) DEFAULT NULL,
  `telefono` varchar(75) DEFAULT NULL,
  `twitter` varchar(75) DEFAULT NULL,
  `whatsapp` varchar(75) DEFAULT NULL,
  `rfc` varchar(250) DEFAULT NULL,
  `nombre` varchar(250) DEFAULT NULL,
  `id_cfdi_regimen_fiscal` int(11) DEFAULT NULL,
  `codigo_postal` int(11) DEFAULT NULL,
  `cp` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracion_informacion_empresa`
--

LOCK TABLES `configuracion_informacion_empresa` WRITE;
/*!40000 ALTER TABLE `configuracion_informacion_empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `configuracion_informacion_empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion_cliente`
--

DROP TABLE IF EXISTS `direccion_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion_cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `calle` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `colonia` varchar(255) DEFAULT NULL,
  `cp` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `estado` varchar(255) DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `municipio` varchar(255) DEFAULT NULL,
  `num_exterior` varchar(255) DEFAULT NULL,
  `num_interior` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `catalogo_cliente_id` int(11) DEFAULT NULL,
  `ultima_sucursal` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion_cliente`
--

LOCK TABLES `direccion_cliente` WRITE;
/*!40000 ALTER TABLE `direccion_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrada_salida_usuario`
--

DROP TABLE IF EXISTS `entrada_salida_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrada_salida_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `evento1` datetime DEFAULT NULL,
  `evento2` datetime DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `catalogo_usuario_id` int(11) DEFAULT NULL,
  `evento3` datetime DEFAULT NULL,
  `evento4` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada_salida_usuario`
--

LOCK TABLES `entrada_salida_usuario` WRITE;
/*!40000 ALTER TABLE `entrada_salida_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrada_salida_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `existencias_producto_sucursal`
--

DROP TABLE IF EXISTS `existencias_producto_sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `existencias_producto_sucursal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `id_producto` int(11) NOT NULL,
  `id_sucursal` int(11) NOT NULL,
  `total_almacen` decimal(19,4) DEFAULT NULL,
  `total_piso` decimal(19,4) DEFAULT NULL,
  `total_baja` decimal(19,4) DEFAULT NULL,
  `total_venta` decimal(19,4) DEFAULT NULL,
  `total_servicio` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `existencias_producto_sucursal`
--

LOCK TABLES `existencias_producto_sucursal` WRITE;
/*!40000 ALTER TABLE `existencias_producto_sucursal` DISABLE KEYS */;
/*!40000 ALTER TABLE `existencias_producto_sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jornada_laboral`
--

DROP TABLE IF EXISTS `jornada_laboral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jornada_laboral` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dia` enum('LUNES','MARTES','MIERCOLES','JUEVES','VIERNES','SABADO','DOMINGO') DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_fin` time DEFAULT NULL,
  `estatus` enum('ACTIVO','INACTIVO') DEFAULT NULL,
  `tenant` int(11) NOT NULL,
  `catalogo_usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jornada_laboral`
--

LOCK TABLES `jornada_laboral` WRITE;
/*!40000 ALTER TABLE `jornada_laboral` DISABLE KEYS */;
/*!40000 ALTER TABLE `jornada_laboral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina`
--

DROP TABLE IF EXISTS `nomina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_pago` datetime DEFAULT NULL,
  `ganancia_pagado` decimal(19,4) DEFAULT NULL,
  `id_tecnica` int(11) DEFAULT NULL,
  `usuario_pago` int(11) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `total_pagado` decimal(19,4) DEFAULT NULL,
  `descuento` decimal(19,4) DEFAULT NULL,
  `folio` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina`
--

LOCK TABLES `nomina` WRITE;
/*!40000 ALTER TABLE `nomina` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parametros_funcionamiento`
--

DROP TABLE IF EXISTS `parametros_funcionamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parametros_funcionamiento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) NOT NULL,
  `reinicio_venta_al_pagar` tinyint(1) NOT NULL,
  `opcion_entregas_posteriores` tinyint(1) NOT NULL,
  `habilitada_caja_chica` tinyint(1) NOT NULL,
  `habilitada_caja_fuerte` tinyint(1) NOT NULL,
  `habilitada_banco` tinyint(1) NOT NULL COMMENT 'Tabla para administrar las configuraciones necesarias de cada tenant. ',
  `mostrar_todos_empleados_nomina` tinyint(1) NOT NULL,
  `mostrar_salario_fijo_nomina` tinyint(1) NOT NULL,
  `mostrar_vales_nomina` tinyint(1) NOT NULL,
  `mostrar_honorarios` tinyint(1) NOT NULL,
  `habilitar_multiples_precios` tinyint(1) DEFAULT NULL,
  `modulo_agenda` tinyint(1) DEFAULT NULL,
  `modulo_tarjeta_regalo` tinyint(1) DEFAULT NULL,
  `modulo_Almacen` tinyint(1) DEFAULT NULL,
  `modulo_Gastos` tinyint(1) DEFAULT NULL,
  `modulo_Deudas_cobrar` tinyint(1) DEFAULT NULL,
  `modulo_Deudas_pagar` tinyint(1) DEFAULT NULL,
  `modulo_prestamo_empleados` tinyint(1) DEFAULT NULL,
  `modulo_Puestos` tinyint(1) DEFAULT NULL,
  `modulo_Empleados` tinyint(1) DEFAULT NULL,
  `modulo_Permisos_acceso` tinyint(1) DEFAULT NULL,
  `modulo_checador` tinyint(1) DEFAULT NULL,
  `modulo_permisos_laborales` tinyint(1) DEFAULT NULL,
  `modulo_promociones` tinyint(1) DEFAULT NULL,
  `modulo_catSucursales` tinyint(1) DEFAULT NULL,
  `modulo_catClientes` tinyint(1) DEFAULT NULL,
  `modulo_catProveedores` tinyint(1) DEFAULT NULL,
  `modulo_catProductos` tinyint(1) DEFAULT NULL,
  `modulo_catServicios` tinyint(1) DEFAULT NULL,
  `modulo_catConsumibles` tinyint(1) DEFAULT NULL,
  `modulo_catVehiculos` tinyint(1) DEFAULT NULL,
  `modulo_informacion_empresa` tinyint(1) DEFAULT NULL,
  `codigoProductoTicket` tinyint(1) DEFAULT NULL,
  `mostrar_descuento_ticket` tinyint(1) DEFAULT NULL,
  `mostrar_facebook_ticket` tinyint(1) DEFAULT NULL,
  `mostrar_instagram_ticket` tinyint(1) DEFAULT NULL,
  `mostrar_twitter_ticket` tinyint(1) DEFAULT NULL,
  `mostrar_numcitas_ticket` tinyint(1) DEFAULT NULL,
  `mostrar_whatsapp_ticket` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tenant_UNIQUE` (`tenant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parametros_funcionamiento`
--

LOCK TABLES `parametros_funcionamiento` WRITE;
/*!40000 ALTER TABLE `parametros_funcionamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `parametros_funcionamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `id_vehiculo` int(11) DEFAULT NULL,
  `id_usuario_entrega` int(11) DEFAULT NULL,
  `fecha_salida` datetime DEFAULT NULL,
  `fecha_regreso` datetime DEFAULT NULL,
  `combustible` decimal(19,4) DEFAULT NULL,
  `casetas` decimal(19,4) DEFAULT NULL,
  `adicionales` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permiso_modulo_perfil`
--

DROP TABLE IF EXISTS `permiso_modulo_perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permiso_modulo_perfil` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `perfil_usuario` int(11) NOT NULL,
  `tenant` int(11) NOT NULL,
  `agenda` tinyint(1) DEFAULT NULL,
  `tarjeta_regalo` tinyint(1) DEFAULT NULL,
  `almacen` tinyint(1) DEFAULT NULL,
  `linea_credito` tinyint(1) DEFAULT NULL,
  `egresos` tinyint(1) DEFAULT NULL,
  `permisos_laborales` tinyint(1) DEFAULT NULL,
  `prestamos_economicos` tinyint(1) DEFAULT NULL,
  `cat_sucursales` tinyint(1) DEFAULT NULL,
  `cat_perfiles_usuario` tinyint(1) DEFAULT NULL,
  `cat_usuarios` tinyint(1) DEFAULT NULL,
  `cat_clientes` tinyint(1) DEFAULT NULL,
  `cat_proveedores` tinyint(1) DEFAULT NULL,
  `cat_productos` tinyint(1) DEFAULT NULL,
  `cat_servicios` tinyint(1) DEFAULT NULL,
  `venta` tinyint(1) DEFAULT NULL,
  `cat_permisos` tinyint(1) DEFAULT NULL,
  `corte_caja` tinyint(1) DEFAULT NULL,
  `ventas_proceso` tinyint(1) DEFAULT NULL,
  `credito_clientes` tinyint(1) DEFAULT NULL,
  `nomina` tinyint(1) DEFAULT NULL,
  `ventas_detallar_productos` tinyint(1) DEFAULT NULL,
  `huellas_empleados` tinyint(1) DEFAULT NULL,
  `deudas_pagar` tinyint(1) DEFAULT NULL,
  `pedidos` tinyint(1) DEFAULT NULL,
  `facturacion` tinyint(1) DEFAULT NULL,
  `catalogo_vehiculos` tinyint(1) DEFAULT NULL,
  `credito_proveedores` tinyint(1) DEFAULT NULL,
  `permisos_acceso` tinyint(1) DEFAULT NULL,
  `checador` tinyint(1) DEFAULT NULL,
  `promociones` tinyint(1) DEFAULT NULL,
  `cat_consumibles` tinyint(1) DEFAULT NULL,
  `informacionEmpresa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permiso_modulo_perfil`
--

LOCK TABLES `permiso_modulo_perfil` WRITE;
/*!40000 ALTER TABLE `permiso_modulo_perfil` DISABLE KEYS */;
/*!40000 ALTER TABLE `permiso_modulo_perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permisos_laborales`
--

DROP TABLE IF EXISTS `permisos_laborales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permisos_laborales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eliminado` tinyint(1) DEFAULT '0',
  `estatus` varchar(255) DEFAULT NULL,
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `motivo` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `id_usuario_autoriza` int(11) DEFAULT NULL,
  `id_usuario_registra` int(11) DEFAULT NULL,
  `id_usuario_solicita` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permisos_laborales`
--

LOCK TABLES `permisos_laborales` WRITE;
/*!40000 ALTER TABLE `permisos_laborales` DISABLE KEYS */;
/*!40000 ALTER TABLE `permisos_laborales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permisos_usuarios`
--

DROP TABLE IF EXISTS `permisos_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permisos_usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) NOT NULL,
  `eliminado` tinyint(1) DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `fecha_inicio` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL,
  `motivo` varchar(512) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `id_usuario_solicita` int(11) NOT NULL,
  `id_usuario_registra` int(11) NOT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci COMMENT='Tabla para registro de permisos del personal (usuarios)';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permisos_usuarios`
--

LOCK TABLES `permisos_usuarios` WRITE;
/*!40000 ALTER TABLE `permisos_usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `permisos_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `precios_productos`
--

DROP TABLE IF EXISTS `precios_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `precios_productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `precio_menudeo` decimal(19,4) DEFAULT NULL,
  `fecha_aplica` datetime DEFAULT NULL,
  `precio_mayoreo` decimal(19,4) DEFAULT NULL,
  `numero_productos_minimo_mayoreo` decimal(19,4) DEFAULT NULL,
  `producto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `precios_productos`
--

LOCK TABLES `precios_productos` WRITE;
/*!40000 ALTER TABLE `precios_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `precios_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `precios_servicios`
--

DROP TABLE IF EXISTS `precios_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `precios_servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `precio_menudeo` decimal(19,4) DEFAULT NULL,
  `fecha_aplica` datetime DEFAULT NULL,
  `precio_mayoreo` decimal(19,4) DEFAULT NULL,
  `numero_servicio_minimo_mayoreo` decimal(19,4) DEFAULT NULL,
  `servicio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `precios_servicios`
--

LOCK TABLES `precios_servicios` WRITE;
/*!40000 ALTER TABLE `precios_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `precios_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos_economicos`
--

DROP TABLE IF EXISTS `prestamos_economicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prestamos_economicos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `valor` decimal(19,4) DEFAULT NULL,
  `usuario_solicita` int(11) DEFAULT NULL,
  `usuario_registra` int(11) DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos_economicos`
--

LOCK TABLES `prestamos_economicos` WRITE;
/*!40000 ALTER TABLE `prestamos_economicos` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamos_economicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos_extra_venta`
--

DROP TABLE IF EXISTS `productos_extra_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos_extra_venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` varchar(31) DEFAULT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `nombre_producto` varchar(255) DEFAULT NULL,
  `numero_usos` decimal(38,0) DEFAULT NULL,
  `porcentaje_uso` decimal(38,0) DEFAULT NULL,
  `precio_unitario` decimal(38,0) DEFAULT NULL,
  `producto_id` int(11) DEFAULT NULL,
  `servicio` int(11) DEFAULT NULL,
  `venta` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos_extra_venta`
--

LOCK TABLES `productos_extra_venta` WRITE;
/*!40000 ALTER TABLE `productos_extra_venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos_extra_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promociones_combos`
--

DROP TABLE IF EXISTS `promociones_combos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promociones_combos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `valor` decimal(19,4) DEFAULT NULL,
  `lunes` tinyint(1) DEFAULT NULL,
  `martes` tinyint(1) DEFAULT NULL,
  `miercoles` tinyint(1) DEFAULT NULL,
  `jueves` tinyint(1) DEFAULT NULL,
  `viernes` tinyint(1) DEFAULT NULL,
  `sabado` tinyint(1) DEFAULT NULL,
  `domingo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promociones_combos`
--

LOCK TABLES `promociones_combos` WRITE;
/*!40000 ALTER TABLE `promociones_combos` DISABLE KEYS */;
/*!40000 ALTER TABLE `promociones_combos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promociones_cupones_descuento`
--

DROP TABLE IF EXISTS `promociones_cupones_descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promociones_cupones_descuento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `valor` decimal(19,4) DEFAULT NULL,
  `lunes` tinyint(1) DEFAULT NULL,
  `martes` tinyint(1) DEFAULT NULL,
  `miercoles` tinyint(1) DEFAULT NULL,
  `jueves` tinyint(1) DEFAULT NULL,
  `viernes` tinyint(1) DEFAULT NULL,
  `sabado` tinyint(1) DEFAULT NULL,
  `domingo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promociones_cupones_descuento`
--

LOCK TABLES `promociones_cupones_descuento` WRITE;
/*!40000 ALTER TABLE `promociones_cupones_descuento` DISABLE KEYS */;
/*!40000 ALTER TABLE `promociones_cupones_descuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promociones_descuento_venta`
--

DROP TABLE IF EXISTS `promociones_descuento_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promociones_descuento_venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `valor` decimal(19,4) DEFAULT NULL,
  `precioMinimoAplicable` decimal(19,4) DEFAULT NULL,
  `lunes` tinyint(1) DEFAULT NULL,
  `martes` tinyint(1) DEFAULT NULL,
  `miercoles` tinyint(1) DEFAULT NULL,
  `jueves` tinyint(1) DEFAULT NULL,
  `viernes` tinyint(1) DEFAULT NULL,
  `sabado` tinyint(1) DEFAULT NULL,
  `domingo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promociones_descuento_venta`
--

LOCK TABLES `promociones_descuento_venta` WRITE;
/*!40000 ALTER TABLE `promociones_descuento_venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `promociones_descuento_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio_cupones_descuento`
--

DROP TABLE IF EXISTS `servicio_cupones_descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicio_cupones_descuento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicio` int(11) DEFAULT NULL,
  `id_promocion_cupones_descuento` int(11) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  `cantidad` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_servicio` (`servicio`),
  KEY `serviciocuponesdescuentodpromocioncuponesdescuento` (`id_promocion_cupones_descuento`),
  CONSTRAINT `FK_servicio_cupones_descuento_servicio` FOREIGN KEY (`servicio`) REFERENCES `catalogo_servicios` (`id`),
  CONSTRAINT `servicio_cupones_descuento_ibfk_2` FOREIGN KEY (`servicio`) REFERENCES `catalogo_servicios` (`id`),
  CONSTRAINT `serviciocuponesdescuentodpromocioncuponesdescuento` FOREIGN KEY (`id_promocion_cupones_descuento`) REFERENCES `promociones_cupones_descuento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio_cupones_descuento`
--

LOCK TABLES `servicio_cupones_descuento` WRITE;
/*!40000 ALTER TABLE `servicio_cupones_descuento` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio_cupones_descuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio_promocion_combos`
--

DROP TABLE IF EXISTS `servicio_promocion_combos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicio_promocion_combos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicio` int(11) DEFAULT NULL,
  `id_promocion_combos` int(11) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  `cantidad` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_servicio` (`servicio`),
  KEY `FK_servicio_promocion_combos_id_promocion_combos` (`id_promocion_combos`),
  CONSTRAINT `FK_servicio` FOREIGN KEY (`servicio`) REFERENCES `catalogo_servicios` (`id`),
  CONSTRAINT `FK_servicio_promocion_combos_id_promocion_combos` FOREIGN KEY (`id_promocion_combos`) REFERENCES `promociones_combos` (`id`),
  CONSTRAINT `FK_servicio_promocion_combos_servicio` FOREIGN KEY (`servicio`) REFERENCES `catalogo_servicios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio_promocion_combos`
--

LOCK TABLES `servicio_promocion_combos` WRITE;
/*!40000 ALTER TABLE `servicio_promocion_combos` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio_promocion_combos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios_producto`
--

DROP TABLE IF EXISTS `servicios_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicios_producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT '0',
  `fecha_registro` datetime DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `producto` int(11) DEFAULT NULL,
  `servicio` int(11) DEFAULT NULL,
  `porcentaje_uso` decimal(19,4) DEFAULT NULL,
  `estratus` tinyint(1) DEFAULT NULL,
  `numero_usos` decimal(19,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios_producto`
--

LOCK TABLES `servicios_producto` WRITE;
/*!40000 ALTER TABLE `servicios_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicios_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `totales_almacen_economico`
--

DROP TABLE IF EXISTS `totales_almacen_economico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `totales_almacen_economico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `total_entrada_caja` decimal(19,4) NOT NULL,
  `total_salida_caja` decimal(19,4) NOT NULL,
  `existencia_caja` decimal(19,4) NOT NULL,
  `total_entrada_banco` decimal(19,4) NOT NULL,
  `total_salida_banco` decimal(19,4) NOT NULL,
  `existencia_banco` decimal(19,4) NOT NULL,
  `sucursal` int(11) NOT NULL,
  `tenant` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `totales_almacen_economico`
--

LOCK TABLES `totales_almacen_economico` WRITE;
/*!40000 ALTER TABLE `totales_almacen_economico` DISABLE KEYS */;
/*!40000 ALTER TABLE `totales_almacen_economico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_sucursal`
--

DROP TABLE IF EXISTS `usuario_sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_sucursal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `sucursal` int(11) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL,
  `eliminado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_sucursal`
--

LOCK TABLES `usuario_sucursal` WRITE;
/*!40000 ALTER TABLE `usuario_sucursal` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculo` (
  `id` int(11) NOT NULL,
  `tenant` varchar(31) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_duracion_servicios`
--

DROP TABLE IF EXISTS `venta_duracion_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta_duracion_servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '0',
  `duracion_minutos` int(11) DEFAULT NULL,
  `estatus` varchar(255) DEFAULT NULL,
  `estatus_pago` int(11) DEFAULT NULL,
  `fin` datetime DEFAULT NULL,
  `id_usuario_tecnica` int(11) DEFAULT NULL,
  `inicio` datetime DEFAULT NULL,
  `venta_servicios_productos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `activo` (`activo`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_duracion_servicios`
--

LOCK TABLES `venta_duracion_servicios` WRITE;
/*!40000 ALTER TABLE `venta_duracion_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta_duracion_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_servicios_productos`
--

DROP TABLE IF EXISTS `venta_servicios_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta_servicios_productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '0',
  `cantidad` decimal(19,4) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `id_servicio` int(11) DEFAULT NULL,
  `precio_original` decimal(19,4) DEFAULT NULL,
  `precio_unitario` decimal(19,4) DEFAULT NULL,
  `total` decimal(19,4) DEFAULT NULL,
  `venta` int(11) DEFAULT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `id_direccion_entrega` int(11) DEFAULT NULL,
  `entregado` tinyint(1) DEFAULT NULL,
  `estatus_pago` int(11) DEFAULT NULL,
  `notas` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `activo` (`activo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_servicios_productos`
--

LOCK TABLES `venta_servicios_productos` WRITE;
/*!40000 ALTER TABLE `venta_servicios_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta_servicios_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activo` tinyint(1) DEFAULT '0',
  `cliente` int(11) NOT NULL,
  `usuario_registra` int(11) NOT NULL,
  `usuario_vende` int(11) DEFAULT NULL,
  `fecha_registro` datetime NOT NULL,
  `requiere_factura` tinyint(1) DEFAULT NULL,
  `total_venta` decimal(19,4) DEFAULT NULL,
  `usuario_elimina` int(11) DEFAULT NULL,
  `fecha_elimina` datetime DEFAULT NULL,
  `sucursal` int(11) DEFAULT NULL,
  `tenant` int(11) NOT NULL,
  `tipo_publicidad` varchar(255) DEFAULT NULL,
  `efectivo` tinyint(1) DEFAULT NULL,
  `tarjeta_debito` tinyint(1) DEFAULT NULL,
  `tarjeta_credito` tinyint(1) DEFAULT NULL,
  `tarjeta_regalo` tinyint(1) DEFAULT NULL,
  `cantidad_efectivo` decimal(19,4) DEFAULT NULL,
  `cantidad_debito` decimal(19,4) DEFAULT NULL,
  `cantidad_credito` decimal(19,4) DEFAULT NULL,
  `cantidad_regalo` decimal(19,4) DEFAULT NULL,
  `folio_tarjeta` varchar(45) DEFAULT NULL,
  `pendiente_definir_productos` tinyint(1) DEFAULT NULL,
  `id_promocion` int(11) DEFAULT NULL,
  `tipo_promocion` varchar(45) DEFAULT NULL,
  `total_venta_sin_promocion` decimal(19,4) DEFAULT NULL,
  `propina` decimal(19,4) DEFAULT NULL,
  `folio` varchar(6) DEFAULT NULL,
  `cantidad_pago_credito` decimal(19,4) DEFAULT NULL,
  `credito` tinyint(1) DEFAULT NULL,
  `id_corte_caja` int(11) DEFAULT NULL,
  `id_factura` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'arrow'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-05 23:20:38
