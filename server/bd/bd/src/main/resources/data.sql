-- Insertar Galaxias
INSERT INTO galaxias (nombre) VALUES 
('Vía Láctea'),
('Andrómeda'),
('Galaxia del Triángulo'),
('Galaxia del Remolino'),
('Galaxia del Sombrero');

-- Insertar Clientes
INSERT INTO clientes (nombre, apellido, correo, telefono) VALUES 
('Juan', 'Pérez', 'juan.perez@email.com', '+57 311-123-4567'),
('María', 'González', 'maria.gonzalez@email.com', '+57 312-234-5678'),
('Carlos', 'Rodríguez', 'carlos.rodriguez@email.com', '+57 313-345-6789'),
('Ana', 'Martínez', 'ana.martinez@email.com', '+57 314-456-7890'),
('Luis', 'Sánchez', 'luis.sanchez@email.com', '+57 315-567-8901');

-- Insertar Proveedores (necesita galaxias)
INSERT INTO proveedores (nombre, contacto, telefono, galaxia_id) VALUES 
('InterGalactic Parts Co.', 'John Smith', '+1-555-0123', 1),
('Stellar Accessories Ltd.', 'Emma Johnson', '+1-555-0124', 2),
('Cosmic Components Inc.', 'Michael Brown', '+1-555-0125', 3),
('Space Parts Universal', 'Sarah Davis', '+1-555-0126', 4),
('Galactic Gear Solutions', 'David Wilson', '+1-555-0127', 5);

-- Insertar Marcas (necesita galaxias)
INSERT INTO marcas (nombre, galaxia_id) VALUES 
('SpaceX', 1),
('Nova Motors', 2),
('Stellar Vehicles', 3),
('Cosmic Cars', 4),
('AstroAuto', 5);

-- Insertar Vehículos (necesita marcas)
INSERT INTO vehiculos (nombre, marca_id, imagenurl, modelo, anio, color, precio, es_usado, descripcion) VALUES 
('Stellar GT', 1, 'stellar-gt.jpg', 'GT-2025', 2025, 'METAL', 75000, false, 'Deportivo espacial de última generación'),
('Cosmic Cruiser', 2, 'cosmic-cruiser.jpg', 'CC-100', 2024, 'NEGRO', 45000, false, 'SUV familiar espacial'),
('Nova Runner', 3, 'nova-runner.jpg', 'NR-2024', 2024, 'FUEGO', 55000, true, 'Sedan espacial deportivo'),
('Galactic Explorer', 4, 'galactic-explorer.jpg', 'GE-X', 2025, 'AZUL', 65000, false, 'Todo terreno espacial'),
('Star Voyager', 5, 'star-voyager.jpg', 'SV-Elite', 2025, 'URANICO', 85000, false, 'Nave de lujo intergaláctica');

-- Insertar Accesorios (necesita proveedores y vehículos)
INSERT INTO accesorios (nombre, descripcion, precio, proveedor_id, vehiculo_id) VALUES 
('Propulsor Cuántico Plus', 'Mejora la velocidad de crucero espacial', 5000, 1, 1),
('Escudo Deflector Premium', 'Protección contra meteoritos', 3000, 2, 2),
('Sistema Anti-Gravedad', 'Control de gravedad personalizado', 4500, 3, 3),
('Navegador Interestelar', 'GPS espacial de última generación', 2500, 4, 4),
('Cabina Presurizada Deluxe', 'Máximo confort en el espacio', 6000, 5, 5);

-- Insertar Ventas (necesita clientes y vehículos)
INSERT INTO ventas (cliente_id, vehiculo_id, fecha_venta, total, metodo_pago) VALUES 
(1, 1, '2025-01-15', 80000, 'URANIO'),
(2, 2, '2025-02-20', 48000, 'TARJETA'),
(3, 3, '2025-03-25', 59500, 'ORO'),
(4, 4, '2025-04-30', 67500, 'DINERO'),
(5, 5, '2025-05-05', 91000, 'URANIO');

-- Insertar relaciones Venta-Accesorio
INSERT INTO venta_accesorio (venta_id, accesorio_id) VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);