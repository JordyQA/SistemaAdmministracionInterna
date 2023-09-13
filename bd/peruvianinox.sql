-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-09-2023 a las 00:11:30
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peruvianinox`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `IdMaterial` varchar(10) NOT NULL,
  `TipoMaterial` varchar(50) DEFAULT NULL,
  `StockMaterial` int(11) DEFAULT NULL,
  `PrecioUnidad` float(9,2) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `fechaRegistro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`IdMaterial`, `TipoMaterial`, `StockMaterial`, `PrecioUnidad`, `categoria`, `fechaRegistro`) VALUES
('ALM001', 'Plancha de acero inoxidable', 10, 179.00, 'Cocina', '2022-01-15'),
('ALM002', 'Disco de corte', 22, 10.00, 'Lavadero', '2022-08-27'),
('ALM003', 'Ladrillo refractario', 100, 8.00, 'Hornos', '2022-09-15'),
('ALM004', 'Maquina tig para soldar', 1, 2000.00, 'Cocina', '2021-01-17'),
('ALM005', 'Dobladora', 1, 13000.00, 'Cocinas', '2022-03-09'),
('ALM006', 'Quemador', 15, 255.00, 'Estufas', '2022-07-14'),
('ALM007', 'Bandejas', 20, 62.00, 'Horno', '2022-04-12'),
('ALM008', 'Motor', 1, 390.00, 'Herramientas', '2022-04-24'),
('ALM009', 'Pegamento', 8, 40.00, 'Herramientas', '2022-06-13'),
('ALM010', 'Pintura en spray 25ml', 5, 15.00, 'Cocinas', '2022-10-15'),
('ALM011', 'Pulverizador', 1, 129.30, 'Herramientas', '2022-07-14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `IdCliente` varchar(10) NOT NULL,
  `NombreCliente` varchar(100) DEFAULT NULL,
  `DniCliente` varchar(8) DEFAULT NULL,
  `DireccionCliente` varchar(100) DEFAULT NULL,
  `TelefonoCliente` varchar(9) DEFAULT NULL,
  `CorreoCliente` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`IdCliente`, `NombreCliente`, `DniCliente`, `DireccionCliente`, `TelefonoCliente`, `CorreoCliente`) VALUES
('CLI001', 'Maria Ledesma', '41102231', 'Los Olivos', '999114745', 'marled@gmail.com'),
('CLI002', 'Joel Gutierres', '41158875', 'Gamarra', '987410230', 'joel14@gmail.com'),
('CLI003', 'Magnus Bane', '02021159', 'Los Olivos', '951748632', 'mbane21@gmail.com'),
('CLI004', 'Clarissa Feirchald', '41365587', 'Lunahuana', '914635520', 'clary123@gmail.com'),
('CLI005', 'Isabelle Lightwood', '36652147', 'Cusco', '998541200', 'issy.19@gmail.com'),
('CLI006', 'Sebastian Lawrence', '76014852', 'Cañete', '977899635', 'seb.123.law@gmail.com'),
('CLI007', 'Beatrice Prior', '76030487', 'Huancavelica', '999741068', 'trisprior@gmail.com'),
('CLI008', 'Tobias Eaton', '95148263', 'Miraflores', '987521402', 'cuatro1@gmail.com'),
('CLI009', 'Christina Morgenstern', '15973548', 'Surco', '987546654', 'morgenstern@gmail.com'),
('CLI010', 'Valentine Reyes', '95175362', 'Las Flores', '978897953', 'tosimundi@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `IdEmpleado` varchar(10) NOT NULL,
  `NombreEmpleado` varchar(100) NOT NULL,
  `DniEmpleado` varchar(8) NOT NULL,
  `DireccionEmpleado` varchar(100) NOT NULL,
  `TelefonoEmpleado` varchar(9) NOT NULL,
  `Especializacion` varchar(50) NOT NULL,
  `Edad` int(11) DEFAULT NULL,
  `TiempoContrato` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`IdEmpleado`, `NombreEmpleado`, `DniEmpleado`, `DireccionEmpleado`, `TelefonoEmpleado`, `Especializacion`, `Edad`, `TiempoContrato`) VALUES
('EMP001', 'Carlos Cajusol', '40532217', 'Jr. Los Amelos', '987645089', 'Soldador', 20, '1 año'),
('EMP002', 'Paola Rivas', '40240072', 'Las Flores', '926425582', 'Operadora', 30, '6 meses'),
('EMP003', 'Ana Chavez', '09086672', 'Canto Grande', '902210375', 'Vendedora', 25, '6 meses'),
('EMP004', 'Valerie Morey', '73060527', 'Bayovar', '929220187', 'Asesora de ventas', 19, '1 año'),
('EMP005', 'Jonathan Castillo', '0874451', 'Mariscal', '936686765', 'Vendedor', 18, '6 meses'),
('EMP006', 'Jen Brown', '73488150', 'Las Flores', '987345060', 'Vendedora', 18, '6 meses'),
('EMP007', 'Adam Carlsen', '10235698', 'Canto grande', '940766607', 'Distribuidor', 23, '1 año'),
('EMP008', 'Jack Ross', '48471159', 'Jr. Los Amelos', '929221450', 'Fabricante', 20, '1 año'),
('EMP009', 'Jared Garber', '33652247', 'San Ignacio', '98521006', 'Soldador', 21, '1 año'),
('EMP010', 'Jace Herondale', '30201148', 'San Ignacio', '975113264', 'Área de maketing', 24, '1 año');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `IdProducto` varchar(10) NOT NULL,
  `IdMaterial` varchar(10) NOT NULL,
  `NombreProducto` varchar(50) DEFAULT NULL,
  `StockProductoTerminado` int(11) DEFAULT NULL,
  `PrecioProducto` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`IdProducto`, `IdMaterial`, `NombreProducto`, `StockProductoTerminado`, `PrecioProducto`) VALUES
('PRO001', 'ALM001', 'Horno para pollo', 2, 6900.00),
('PRO002', 'ALM002', 'Lavadero', 5, 2300.00),
('PRO003', 'ALM003', 'Horno para pan', 5, 6900.00),
('PRO004', 'ALM004', 'Cocina de 3 hornillas', 4, 2390.00),
('PRO005', 'ALM005', 'Cocina de 4 hornillas', 4, 3200.00),
('PRO006', 'ALM006', 'Carrito sandwichero', 2, 1850.00),
('PRO007', 'ALM007', 'Campana y ductería', 4, 750.00),
('PRO008', 'ALM008', 'Freidora automática', 3, 3300.00),
('PRO009', 'ALM009', 'Brostera Industrial', 4, 1295.00),
('PRO010', 'ALM001', 'Caja china', 6, 2900.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `codigo` varchar(8) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`codigo`, `nombre`, `apellidos`, `correo`, `telefono`, `password`) VALUES
('U001', 'Jordy Jeanpier', 'Quispe Acedo', 'jordy', '946634065', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `IdVenta` varchar(10) NOT NULL,
  `IdEmpleado` varchar(10) NOT NULL,
  `dniCliente` varchar(15) NOT NULL,
  `IdProducto` varchar(10) NOT NULL,
  `FechaPedido` date NOT NULL,
  `FechaEntrega` date NOT NULL,
  `TipoDeEntrega` varchar(50) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `TipoPago` varchar(50) NOT NULL,
  `Total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`IdVenta`, `IdEmpleado`, `dniCliente`, `IdProducto`, `FechaPedido`, `FechaEntrega`, `TipoDeEntrega`, `Cantidad`, `TipoPago`, `Total`) VALUES
('VEN001', 'EMP001', '41102231', 'PRO001', '2022-01-03', '2022-01-07', 'Envío a domicilio', 1, 'Pago con tarjeta', 6900.00),
('VEN002', 'EMP002', '36652147', 'PRO002', '2022-01-08', '2022-01-12', 'A domicilio', 3, 'Efectivo', 2300.00),
('VEN003', 'EMP003', '76030487', 'PRO003', '2022-01-15', '2022-01-22', 'Recoger en local', 1, 'Efectivo', 6900.00),
('VEN004', 'EMP004', '15973548', 'PRO004', '2022-01-25', '2022-01-31', 'Envío a domicilio', 1, 'Efectivo', 2390.00),
('VEN005', 'EMP005', '02021159', 'PRO005', '2022-02-10', '2022-02-18', 'Recoger en local', 1, 'Efectivo', 3200.00),
('VEN006', 'EMP006', '95148263', 'PRO006', '2022-03-25', '2022-03-31', 'Recoger en local', 1, 'Efectivo', 1850.00),
('VEN008', 'EMP008', '02021159', 'PRO008', '2022-05-11', '2022-05-18', 'Envío a domicilio', 1, 'Efectivo', 3300.00),
('VEN009', 'EMP009', '76030487', 'PRO009', '2022-07-22', '2022-07-28', 'Contra entrega', 1, 'Efectivo', 1295.00),
('VEN010', 'EMP010', '41102231', 'PRO010', '2022-10-16', '2022-10-23', 'Contra entrega', 1, 'Efectivo', 2900.00),
('VEN011', 'EMP008', '36652147', 'PRO008', '2022-05-11', '2022-05-18', 'Presencial', 1, 'Crédito', 3300.00),
('VEN012', 'EMP008', '36652147', 'PRO008', '2022-05-11', '2022-05-18', 'A domicilio', 1, 'Efectivo', 3300.00);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`IdMaterial`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IdCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`IdEmpleado`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`IdProducto`),
  ADD KEY `IdMaterial` (`IdMaterial`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`IdVenta`),
  ADD KEY `IdEmpleado` (`IdEmpleado`),
  ADD KEY `IdCliente` (`dniCliente`),
  ADD KEY `IdProducto` (`IdProducto`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`IdMaterial`) REFERENCES `almacen` (`IdMaterial`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`IdEmpleado`) REFERENCES `empleado` (`IdEmpleado`),
  ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
