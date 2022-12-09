-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 11-11-2021 a las 20:41:27
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ticoviajes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `choferes`
--

DROP TABLE IF EXISTS `choferes`;
CREATE TABLE IF NOT EXISTS `choferes` (
  `ID_Chofer` int(11) NOT NULL AUTO_INCREMENT,
  `Cedula` varchar(20) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Apellido` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_Chofer`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `Id_Clientes` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre_cliente` varchar(150) NOT NULL,
  `Apellidos_cliente` varchar(150) NOT NULL,
  `Viajes` varchar(200) NOT NULL,
  `Numero_Asiento` int(50) NOT NULL,
  `Estado_Asiento` varchar(150) NOT NULL,
  PRIMARY KEY (`Id_Clientes`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encomienda`
--

DROP TABLE IF EXISTS `encomienda`;
CREATE TABLE IF NOT EXISTS `encomienda` (
  `Id_Encomienda` int(11) NOT NULL AUTO_INCREMENT,
  `Codigo` varchar(200) NOT NULL,
  `Peso` varchar(200) NOT NULL,
  `Precio_X_Peso` varchar(200) NOT NULL,
  `Nombre_Persona_Entrega` varchar(200) NOT NULL,
  `Nombre_Persona_Retira` varchar(200) NOT NULL,
  `Viajes` varchar(200) NOT NULL,
  `Id_Flotilla` int(11) NOT NULL,
  `Lugar_Salida` varchar(200) NOT NULL,
  `Lugar_Destino` varchar(200) NOT NULL,
  `hora` time NOT NULL,
  `FechaSalida` varchar(200) NOT NULL,
  `FechaLlegada` varchar(200) NOT NULL,
  `Fecha_Entrega_Destinario` varchar(200) NOT NULL,
  `Hora_Entrega_Destinario` varchar(200) NOT NULL,
  `Estado` varchar(200) NOT NULL,
  PRIMARY KEY (`Id_Encomienda`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `flotilla`
--

DROP TABLE IF EXISTS `flotilla`;
CREATE TABLE IF NOT EXISTS `flotilla` (
  `Id_flotilla` int(11) NOT NULL AUTO_INCREMENT,
  `Placa` varchar(50) NOT NULL,
  `Capacidad_Pasajeros` varchar(50) NOT NULL,
  `Estado` varchar(200) NOT NULL,
  PRIMARY KEY (`Id_flotilla`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

DROP TABLE IF EXISTS `precios`;
CREATE TABLE IF NOT EXISTS `precios` (
  `Id_precio` int(11) NOT NULL AUTO_INCREMENT,
  `Precio` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_precio`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viajes`
--

DROP TABLE IF EXISTS `viajes`;
CREATE TABLE IF NOT EXISTS `viajes` (
  `ID_Viajes` int(11) NOT NULL AUTO_INCREMENT,
  `Punto_salida` varchar(150) NOT NULL,
  `Punto_destino` varchar(150) NOT NULL,
  `Precio` varchar(150) NOT NULL,
  `Cantidad_kilometros` varchar(100) NOT NULL,
  `Id_flotilla` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora_salida` time NOT NULL,
  `Hora_llegada` time NOT NULL,
  `viaje` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_Viajes`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
