INSERT INTO Departamento (nombre) VALUES ('Lima');
INSERT INTO Departamento (nombre) VALUES ('La Libertad');
INSERT INTO Departamento (nombre) VALUES ('Piura');
INSERT INTO Departamento (nombre) VALUES  ('Arequipa');
INSERT INTO Departamento (nombre) VALUES ('Cusco');
INSERT INTO Departamento (nombre) VALUES ('Junín');
INSERT INTO Departamento (nombre) VALUES ('Loreto');
INSERT INTO Departamento (nombre) VALUES ('Lambayeque');
INSERT INTO Departamento (nombre) VALUES ('Callao');
INSERT INTO Departamento (nombre) VALUES ('Ica');

INSERT INTO Provincia (nombre, departamento_id) VALUES ('Lima', 1);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Trujillo', 2);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Piura', 3);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Arequipa', 4);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Cusco', 5);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Huancayo', 6);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Maynas', 7);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Chiclayo', 8);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Callao', 9);
INSERT INTO Provincia (nombre, departamento_id) VALUES ('Ica', 10);

INSERT INTO Distrito (nombre, provincia_id) VALUES ('Cercado de Lima', 1);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Miraflores', 1);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Surco', 1);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Trujillo', 2);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Laredo', 2);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Piura', 3);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Castilla', 3);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Arequipa', 4);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Cayma', 4);
INSERT INTO Distrito (nombre, provincia_id) VALUES ('Cusco', 5);

INSERT INTO Cliente (nombre, apellido, telefono, correo, clave,direccion, referencia, registro, distrito_id) VALUES ('Juan Pérez', 'González', '987654321', 'juan.perez@email.com','clave123', 'Calle Mayor 123', 'Cerca del parque', '2023-11-14', 2);

INSERT INTO Comprobante (descripcion, estado) VALUES ('Factura', 1);
INSERT INTO Comprobante (descripcion, estado) VALUES ('Boleta de Venta', 1);
INSERT INTO Comprobante (descripcion, estado) VALUES ('Nota de Credito', 1);

INSERT INTO Venta (actualizacion, pedido, aceptacion, entrega, consumidor, queja, modalidad, pago, serie, numero, fase, situacion, estado, comprobante_id, cliente_id) VALUES ('2023-11-14', '2023-11-10', NULL, NULL, 'Juan Perez', '', 'Delivery', 'Efectivo', 'serie_venta', 'numero_venta', 'En espera', 'Sin procesar', 1, 1, 1);

INSERT INTO Queja (motivo, accion, situacion, estado, venta_id) VALUES ('Producto dañado', 'Reemplazo', 'Esperando envío del reemplazo', 1, 1);

INSERT INTO Sucursal (descripcion, telefono, direccion, estado, distrito_id) VALUES ('Sucursal Miraflores', '954321098', 'Av. Benavides 456', 1, 2);

INSERT INTO Genero (descripcion, abreviatura) VALUES ('Masculino', 'M');
INSERT INTO Genero (descripcion, abreviatura) VALUES ('Femenino', 'F');

INSERT INTO Color (descripcion, estado) VALUES ('Negro', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Blanco', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Rojo', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Azul', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Verde', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Gris', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Marrón', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Amarillo', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Naranja', 1);
INSERT INTO Color (descripcion, estado) VALUES ('Morado', 1);

INSERT INTO Marca (descripcion, telefono, direccion, estado) VALUES ('Adidas', '+49 (940) 7330', 'Herzogenaurach, Alemania', 1);
INSERT INTO Marca (descripcion, telefono, direccion, estado) VALUES ('Nike', '+1 503-266-6331', 'Beaverton, Oregon, Estados Unidos', 1);

INSERT INTO Talla (descripcion, tipo, estado) VALUES ('S', 'Ropa', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('M', 'Ropa', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('L', 'Ropa', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('XL', 'Ropa', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('36', 'Calzado', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('37', 'Calzado', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('38', 'Calzado', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('39', 'Calzado', 1);
INSERT INTO Talla (descripcion, tipo, estado) VALUES ('40', 'Calzado', 1);

INSERT INTO Categoria (descripcion, tienda, delivery, temporada, estado) VALUES ('Tazas', 1, 1, 1, 1);
INSERT INTO Categoria (descripcion, tienda, delivery, temporada, estado) VALUES ('Platos', 1, 1, 1, 1);
INSERT INTO Categoria (descripcion, tienda, delivery, temporada, estado) VALUES ('Lapciers', 1, 1, 1, 1);

INSERT INTO Producto (descripcion, presentacion, costo, precio, cantidad, palabra, imagen, estado, color_id, genero_id, marca_id, talla_id, categoria_id, sucursal_id) VALUES ('Producto 1', 'Presentacion 1', 10.0, 15.0, 10, 'Palabra 1', 'imagen1.jpg', 1, 1, 1, 1, 1, 1, 1);

INSERT INTO Profesional (nombre, apellido, usuario, dni, telefono, correo, clave, nivel, registro, estado) VALUES ('Juan Pérez', 'González', 'j.perez', '12345678', '987654321', 'juan.perez@email.com', 'hashed_password', 'Vendedor', '2023-11-14', 1);

INSERT INTO Kardex (producto_id, profesional_id, fecha, tipo, instancia, cantidad, monto, estado) VALUES (1, 1, '2023-11-14', 'Ingreso', 'Compra', 5, 50.0, 1);

-- Assuming Venta with ID 1 and Producto with ID 3, price 10.0
INSERT INTO Detalle (venta_id, producto_id, descripcion, personalizacion, cantidad, precio, descuento, total, relacion, stock) VALUES (1, 1, 'Camisa talla M (color Blanco)', '', 10, 10.0, 0.0, 10.0, 'Ninguna', 10);
