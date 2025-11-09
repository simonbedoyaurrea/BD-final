Ahora, cuando se  inicie la aplicación:

- Hibernate creará las tablas (`spring.jpa.hibernate.ddl-auto=create`)
- Spring ejecutará el `data.sql` automáticamente para insertar los datos de prueba

Los datos incluyen:

- 5 galaxias
- 5 clientes con correos y teléfonos
- 5 proveedores, uno por galaxia
- 5 marcas de vehículos espaciales
- 5 vehículos con diferentes características
- 5 accesorios relacionados con proveedores y vehículos
- 5 ventas con diferentes métodos de pago
- Relaciones entre ventas y accesorios

### Para probar:

1. Reinicia la aplicación (los datos se insertarán automáticamente)
2. Puedes verificar los datos con consultas SQL o a través de tu API

### IMPORTANTE:

tenga en cuenta que son datos mock, y cada vez que se vuelva a ejecutar el programa todas las tablas van a tener los datos base, si quiere evitar que esto pase (quiere tener persistencia de datos) haga lo siguiente:

Cambié `ddl-auto` a `create` para que se recreen las tablas.  
Cuando termines de probar, cámbialo de nuevo a `update` para **mantener los datos**.
