-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-09-2023 a las 07:24:34
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
-- Base de datos: `peruvianinoxjava`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `IdMaterial` int(11) NOT NULL,
  `TipoMaterial` varchar(50) DEFAULT NULL,
  `StockMaterial` int(11) DEFAULT NULL,
  `PrecioUnidad` float(9,2) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `fechaRegistro` datetime DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaEliminar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`IdMaterial`, `TipoMaterial`, `StockMaterial`, `PrecioUnidad`, `categoria`, `fechaRegistro`, `fechaEditar`, `fechaEliminar`) VALUES
(1, 'dsfv23', 2335, 232.00, 'sdafsdf', '2023-09-06 00:00:00', '2023-09-07 00:01:52', '2023-09-07 00:03:03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areempleados`
--

CREATE TABLE `areempleados` (
  `idArea` int(11) NOT NULL,
  `nombreArea` varchar(50) NOT NULL,
  `fechaRegistrar` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaElimar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriaproductos`
--

CREATE TABLE `categoriaproductos` (
  `idCategoria` int(11) NOT NULL,
  `nombreCategoria` varchar(50) DEFAULT NULL,
  `fechaRegistrar` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaElimar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `IdCliente` int(11) NOT NULL,
  `NombreCliente` varchar(100) DEFAULT NULL,
  `DniCliente` varchar(8) DEFAULT NULL,
  `DireccionCliente` varchar(100) DEFAULT NULL,
  `TelefonoCliente` varchar(9) DEFAULT NULL,
  `CorreoCliente` varchar(100) DEFAULT NULL,
  `fechaRegistro` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `FechaEliminar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`IdCliente`, `NombreCliente`, `DniCliente`, `DireccionCliente`, `TelefonoCliente`, `CorreoCliente`, `fechaRegistro`, `fechaEditar`, `FechaEliminar`) VALUES
(1, 'JORDY', '23453', 'MX NLT 4', '94536945', 'ASFSDG34', '2023-09-07 00:11:41', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `IdEmpleado` int(11) NOT NULL,
  `NombreEmpleado` varchar(100) NOT NULL,
  `DniEmpleado` varchar(8) NOT NULL,
  `DireccionEmpleado` varchar(100) NOT NULL,
  `TelefonoEmpleado` varchar(9) NOT NULL,
  `Especializacion` varchar(50) NOT NULL,
  `Edad` int(11) DEFAULT NULL,
  `TiempoContrato` varchar(9) NOT NULL,
  `fechaRegistro` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaEliminar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`IdEmpleado`, `NombreEmpleado`, `DniEmpleado`, `DireccionEmpleado`, `TelefonoEmpleado`, `Especializacion`, `Edad`, `TiempoContrato`, `fechaRegistro`, `fechaEditar`, `fechaEliminar`) VALUES
(1, 'jordy', '73054560', 'mz n lt 3 sjl', '946634065', 'soldador', 24, '2 meses', '2023-09-07 00:13:32', NULL, NULL),
(2, 'jordy', '73054560', 'mz n lt 3 sjl', '946634065', 'soldador', 26, '2 meses', '2023-09-07 00:13:32', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `IdProducto` int(11) NOT NULL,
  `IdMaterial` int(11) NOT NULL,
  `NombreProducto` varchar(50) DEFAULT NULL,
  `StockProductoTerminado` int(11) DEFAULT NULL,
  `PrecioProducto` decimal(10,2) DEFAULT NULL,
  `fechaRegistro` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaEliminar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `password` varchar(50) NOT NULL,
  `fechaRegistro` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaEliminar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`codigo`, `nombre`, `apellidos`, `correo`, `telefono`, `password`, `fechaRegistro`, `fechaEditar`, `fechaEliminar`) VALUES
(1, 'jordy jeanpier', 'Quispe Acedo', 'admin', '946634065', 'admin', '2023-09-07 00:14:55', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `IdVenta` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `FechaPedido` date NOT NULL,
  `FechaEntrega` date NOT NULL,
  `TipoDeEntrega` varchar(50) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `TipoPago` varchar(50) NOT NULL,
  `Total` decimal(10,2) NOT NULL,
  `fechaRegistro` datetime NOT NULL DEFAULT current_timestamp(),
  `fechaEditar` datetime DEFAULT NULL,
  `fechaEliminar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`IdMaterial`);

--
-- Indices de la tabla `areempleados`
--
ALTER TABLE `areempleados`
  ADD PRIMARY KEY (`idArea`);

--
-- Indices de la tabla `categoriaproductos`
--
ALTER TABLE `categoriaproductos`
  ADD PRIMARY KEY (`idCategoria`);

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
  ADD KEY `producto_ibfk_1` (`IdMaterial`);

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
  ADD KEY `venta_ibfk_1` (`IdEmpleado`),
  ADD KEY `venta_ibfk_2` (`IdCliente`),
  ADD KEY `venta_ibfk_3` (`IdProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `almacen`
--
ALTER TABLE `almacen`
  MODIFY `IdMaterial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `areempleados`
--
ALTER TABLE `areempleados`
  MODIFY `idArea` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `categoriaproductos`
--
ALTER TABLE `categoriaproductos`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IdCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `IdEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `IdProducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `IdVenta` int(11) NOT NULL AUTO_INCREMENT;

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
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`),
  ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
