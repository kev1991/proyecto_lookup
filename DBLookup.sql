-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-03-2022 a las 18:30:47
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `01`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_custionario`
--

CREATE TABLE `categoria_custionario` (
  `id_Ca__custionario` int(11) NOT NULL,
  `nombre_custionario` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria_custionario`
--

INSERT INTO `categoria_custionario` (`id_Ca__custionario`, `nombre_custionario`) VALUES
(1, 'fact_extralaborales'),
(2, 'fact_intraalaborales_A'),
(3, 'fact_intraalaborales_B'),
(4, 'estres');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuestionario`
--

CREATE TABLE `cuestionario` (
  `id_cuestionario` int(11) NOT NULL,
  `cues_fecha_cracion` date NOT NULL,
  `cues_nombre` varchar(100) NOT NULL,
  `cues_is_active` tinyint(4) NOT NULL,
  `cues_descrpcion` varchar(200) NOT NULL,
  `id_Ca__custionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuestionario`
--

INSERT INTO `cuestionario` (`id_cuestionario`, `cues_fecha_cracion`, `cues_nombre`, `cues_is_active`, `cues_descrpcion`, `id_Ca__custionario`) VALUES
(1, '2022-03-28', 'CUESTIONARIO PARA LA EVALUACIÓN DEL ESTRÉS', 1, 'este cuestionario es para validar como se encuentra el nivel de estrés del empleado', 4),
(2, '2022-03-28', 'la zona donde usted vive', 1, 'evaluaremos como se encuentra la persona en sus condiciones extralaboral ', 1),
(3, '2022-03-28', 'sitio o lugar donde habitualmente realiza su trabajo.', 1, 'como se encuentra las instalaciones donde usted normalmente trabaja', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diligenciamiento_cuestionario`
--

CREATE TABLE `diligenciamiento_cuestionario` (
  `id_diligenciamiento_cuestionario` int(11) NOT NULL,
  `dili_concentimiento_BRP` tinyint(4) NOT NULL,
  `dili_is_active` tinyint(4) NOT NULL,
  `dili_fecha_aplicacin` date NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_cuestionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `diligenciamiento_cuestionario`
--

INSERT INTO `diligenciamiento_cuestionario` (`id_diligenciamiento_cuestionario`, `dili_concentimiento_BRP`, `dili_is_active`, `dili_fecha_aplicacin`, `id_usuario`, `id_cuestionario`) VALUES
(1, 1, 1, '2022-03-21', 1, 1),
(2, 1, 1, '2022-03-21', 5, 2),
(3, 1, 1, '2022-03-28', 3, 3),
(4, 1, 1, '2022-03-21', 6, 1),
(5, 1, 1, '2022-03-28', 2, 2),
(6, 1, 1, '2022-03-21', 4, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opcion_respuesta`
--

CREATE TABLE `opcion_respuesta` (
  `id_Op_respuesta` int(11) NOT NULL,
  `opres_create_at` date NOT NULL,
  `opres_is_active` tinyint(4) NOT NULL,
  `id_pregunta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `opcion_respuesta`
--

INSERT INTO `opcion_respuesta` (`id_Op_respuesta`, `opres_create_at`, `opres_is_active`, `id_pregunta`) VALUES
(1, '2022-03-28', 1, 1),
(2, '2022-03-28', 1, 2),
(3, '2022-03-28', 1, 3),
(4, '2022-03-28', 1, 4),
(5, '2022-03-28', 1, 5),
(6, '2022-03-28', 1, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL,
  `perfil` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`id_perfil`, `perfil`) VALUES
(1, 'SuperAdmin'),
(2, 'Admin'),
(3, 'Encuestador'),
(5, 'Encuestado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL,
  `per_nombre` varchar(50) NOT NULL,
  `per_segundo_nombre` varchar(50) NOT NULL,
  `per_apellido` varchar(50) NOT NULL,
  `per_segundo_apellido` varchar(50) NOT NULL,
  `per_tipo_documento` varchar(50) NOT NULL,
  `per_numero_documento` varchar(50) NOT NULL,
  `per_fecha_nacimiento` date NOT NULL,
  `per_email` varchar(100) NOT NULL,
  `per_email_corporativo` varchar(100) NOT NULL,
  `per_cargo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_persona`, `per_nombre`, `per_segundo_nombre`, `per_apellido`, `per_segundo_apellido`, `per_tipo_documento`, `per_numero_documento`, `per_fecha_nacimiento`, `per_email`, `per_email_corporativo`, `per_cargo`) VALUES
(1, 'kebin', 'jose', 'martinez', 'tapias ', 'cc', '1007895874', '2022-03-17', 'kebin@gmail,com', 'kebin@misena.edu.co', 'emoleado'),
(2, 'valeria', 'alexandra', 'godoy', 'gualteros', 'cc', '10005897495', '2022-03-17', 'valeria@gmail.com', 'valeria@misena.edu.co', 'empleado'),
(6, 'JEFFREY ', ' GIOVANNY ', ' PENALOZA  ', 'ROMERO', 'CC', '1478369', '2013-03-11', 'giovanny@gmail.com\r\n', 'giovanny@misena.edu.co\r\n', 'empleado'),
(7, 'SAMUEL ', ' DAVID  ', 'RUDAS  ', 'SANCHEZ', 'CC', 'SANCHEZ', '2012-03-10', 'samuel@gmail.com\r\n', 'samuel@misena.edu.co\r\n', 'analista '),
(8, 'JEAN  ', 'DAVID  ', 'RIOS  ', 'PACHON', 'CC', '397128465', '2012-03-01', 'jean@gmail.com\r\n', 'jean@misena.edu.co\r\n', 'empleado'),
(9, 'JOHAN ', ' FABIAN ', ' RINCON  ', 'YARA', 'CC', '123456', '2012-03-01', 'johan@gmail.com\r\n', 'johan@misena.edu.co\r\n', 'analista ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id_pregunta` int(11) NOT NULL,
  `pre_title` varchar(50) NOT NULL,
  `pre_descripcion` longtext NOT NULL,
  `pre_is_active` tinyint(4) NOT NULL,
  `pre_is_multiple` tinyint(4) NOT NULL,
  `pre_create_at` date NOT NULL,
  `pre_puntaje` int(5) NOT NULL,
  `id_cuestionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id_pregunta`, `pre_title`, `pre_descripcion`, `pre_is_active`, `pre_is_multiple`, `pre_create_at`, `pre_puntaje`, `id_cuestionario`) VALUES
(1, 'estrés', '1. Dolores en el cuello y espalda o tensión muscular.', 1, 1, '2022-03-27', 5, 1),
(2, 'estrés', '2. Problemas gastrointestinales, úlcera péptica, acidez, problemas digestivos o del colon.  ', 1, 1, '2022-03-24', 4, 1),
(3, 'EXTRALABORALES ', '1. Es fácil trasportarme entre mi casa y el trabajo', 1, 1, '2022-03-24', 5, 2),
(4, 'EXTRALABORALES ', '2. Tengo que tomar varios medios de  transporte para llegar a mi lugar de trabajo ', 1, 1, '2022-03-15', 2, 2),
(5, 'INTRALABORAL', '1. El ruido en el lugar donde trabajo es molesto ', 1, 1, '2022-03-15', 5, 3),
(6, 'INTRALABORAL', 'En el lugar donde trabajo hace mucho frío', 1, 1, '2022-03-14', 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `id_respuesta` int(11) NOT NULL,
  `id_Op_respuesta` int(11) DEFAULT NULL,
  `id_pregunta` int(11) NOT NULL,
  `id_diligenciamiento_cuestionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_password` varchar(100) NOT NULL,
  `user_is_active` tinyint(4) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `id_perfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `user_name`, `user_password`, `user_is_active`, `id_persona`, `id_perfil`) VALUES
(1, 'valeria123', '123', 1, 2, 1),
(2, 'kev123', '123', 1, 1, 2),
(3, 'jeffrey123', '123', 1, 6, 5),
(4, 'samu123', '123', 1, 7, 1),
(5, 'jean123', '123', 1, 8, 3),
(6, 'johan123', '123', 1, 9, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria_custionario`
--
ALTER TABLE `categoria_custionario`
  ADD PRIMARY KEY (`id_Ca__custionario`);

--
-- Indices de la tabla `cuestionario`
--
ALTER TABLE `cuestionario`
  ADD PRIMARY KEY (`id_cuestionario`),
  ADD KEY `id_Ca__custionario` (`id_Ca__custionario`);

--
-- Indices de la tabla `diligenciamiento_cuestionario`
--
ALTER TABLE `diligenciamiento_cuestionario`
  ADD PRIMARY KEY (`id_diligenciamiento_cuestionario`),
  ADD KEY `id_cuestionario` (`id_cuestionario`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `opcion_respuesta`
--
ALTER TABLE `opcion_respuesta`
  ADD PRIMARY KEY (`id_Op_respuesta`),
  ADD KEY `id_pregunta` (`id_pregunta`);

--
-- Indices de la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id_perfil`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id_pregunta`),
  ADD KEY `id_cuestionario` (`id_cuestionario`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`id_respuesta`),
  ADD KEY `id_diligenciamiento_cuestionario` (`id_diligenciamiento_cuestionario`),
  ADD KEY `id_Op_respuesta` (`id_Op_respuesta`),
  ADD KEY `id_pregunta` (`id_pregunta`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `id_persona` (`id_persona`),
  ADD KEY `id_perfil` (`id_perfil`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria_custionario`
--
ALTER TABLE `categoria_custionario`
  MODIFY `id_Ca__custionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `cuestionario`
--
ALTER TABLE `cuestionario`
  MODIFY `id_cuestionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `diligenciamiento_cuestionario`
--
ALTER TABLE `diligenciamiento_cuestionario`
  MODIFY `id_diligenciamiento_cuestionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `opcion_respuesta`
--
ALTER TABLE `opcion_respuesta`
  MODIFY `id_Op_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id_perfil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_persona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id_pregunta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cuestionario`
--
ALTER TABLE `cuestionario`
  ADD CONSTRAINT `cuestionario_ibfk_1` FOREIGN KEY (`id_Ca__custionario`) REFERENCES `categoria_custionario` (`id_Ca__custionario`);

--
-- Filtros para la tabla `diligenciamiento_cuestionario`
--
ALTER TABLE `diligenciamiento_cuestionario`
  ADD CONSTRAINT `diligenciamiento_cuestionario_ibfk_1` FOREIGN KEY (`id_cuestionario`) REFERENCES `cuestionario` (`id_cuestionario`),
  ADD CONSTRAINT `diligenciamiento_cuestionario_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `opcion_respuesta`
--
ALTER TABLE `opcion_respuesta`
  ADD CONSTRAINT `opcion_respuesta_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `pregunta` (`id_pregunta`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`id_cuestionario`) REFERENCES `cuestionario` (`id_cuestionario`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_1` FOREIGN KEY (`id_diligenciamiento_cuestionario`) REFERENCES `diligenciamiento_cuestionario` (`id_diligenciamiento_cuestionario`),
  ADD CONSTRAINT `respuesta_ibfk_2` FOREIGN KEY (`id_Op_respuesta`) REFERENCES `opcion_respuesta` (`id_Op_respuesta`),
  ADD CONSTRAINT `respuesta_ibfk_3` FOREIGN KEY (`id_pregunta`) REFERENCES `pregunta` (`id_pregunta`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*hola*/