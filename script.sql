USE [master]
GO
/****** Object:  Database [dbInnovasys]    Script Date: 20/8/2018 05:43:41 ******/
CREATE DATABASE [dbInnovasys]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dbInnovasys', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\dbInnovasys.mdf' , SIZE = 4160KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'dbInnovasys_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\dbInnovasys_log.ldf' , SIZE = 1040KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [dbInnovasys] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dbInnovasys].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dbInnovasys] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dbInnovasys] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dbInnovasys] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dbInnovasys] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dbInnovasys] SET ARITHABORT OFF 
GO
ALTER DATABASE [dbInnovasys] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [dbInnovasys] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [dbInnovasys] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dbInnovasys] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dbInnovasys] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dbInnovasys] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dbInnovasys] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dbInnovasys] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dbInnovasys] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dbInnovasys] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dbInnovasys] SET  ENABLE_BROKER 
GO
ALTER DATABASE [dbInnovasys] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dbInnovasys] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dbInnovasys] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dbInnovasys] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dbInnovasys] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dbInnovasys] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dbInnovasys] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dbInnovasys] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [dbInnovasys] SET  MULTI_USER 
GO
ALTER DATABASE [dbInnovasys] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dbInnovasys] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dbInnovasys] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dbInnovasys] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [dbInnovasys]
GO
/****** Object:  Table [dbo].[bitacoraCliente]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[bitacoraCliente](
	[idBitacoraC] [int] NOT NULL,
	[fechaEntrada] [datetime] NOT NULL,
	[idCliente] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idBitacoraC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[bitacoraEmpleado]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[bitacoraEmpleado](
	[idBitacora] [int] NOT NULL,
	[fechaEntrada] [datetime] NULL,
	[idEmpleado] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idBitacora] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[categoriaProducto]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[categoriaProducto](
	[idCategoria] [int] NOT NULL,
	[nombreCategoria] [varchar](60) NULL,
	[descripcion] [text] NULL,
	[visualizacion_3D] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[idCategoria] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[cliente]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[cliente](
	[idCliente] [int] NOT NULL,
	[nombre] [varchar](60) NULL,
	[apellido] [varchar](70) NULL,
	[corporativo] [bit] NOT NULL,
	[dui] [int] NOT NULL,
	[nit] [int] NOT NULL,
	[correoElectronico] [varchar](70) NOT NULL,
	[contraseña] [varchar](80) NULL,
	[preguntaSeguridad1] [varchar](120) NULL,
	[preguntaSeguridad2] [varchar](120) NULL,
	[telefono] [int] NULL,
	[RespuestaSeguridad1] [varchar](200) NULL,
	[RespuestaSeguridad2] [varchar](200) NULL,
	[fechaRegistro] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[idCliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[creditoFiscal]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[creditoFiscal](
	[noCreditoFiscal] [int] NOT NULL,
	[numRegistro] [int] NOT NULL,
	[fecha] [datetime] NULL,
	[idEmpleado] [int] NOT NULL,
	[idCliente] [int] NOT NULL,
	[iva] [numeric](5, 3) NULL,
	[retencion] [numeric](5, 3) NULL,
	[extento] [numeric](5, 3) NULL,
	[monto_total] [numeric](5, 3) NOT NULL,
	[observaciones] [varchar](120) NULL,
	[cancelado] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[noCreditoFiscal] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[datosEmpresa]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[datosEmpresa](
	[numRegistro] [int] NOT NULL,
	[nombreEmpresa] [varchar](80) NOT NULL,
	[domicilioLegal] [varchar](120) NOT NULL,
	[fechaConstitucion] [date] NULL,
	[descripcion] [text] NULL,
	[logo] [varchar](120) NULL,
	[telefono] [int] NOT NULL,
	[telefono2] [int] NULL,
	[fax] [int] NULL,
	[fax2] [int] NULL,
	[correoElectronico] [varchar](40) NULL,
	[correoElectronico2] [varchar](40) NULL,
	[propietario] [varchar](60) NOT NULL,
	[noSerieFactura] [int] NOT NULL,
	[noSerieFiscal] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[numRegistro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[detalleCreditoFiscal]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detalleCreditoFiscal](
	[idDetalle] [int] NOT NULL,
	[noCreditoFiscal] [int] NOT NULL,
	[idProducto] [int] NOT NULL,
	[cantidadProducto] [int] NOT NULL,
	[precioImpuestos] [numeric](5, 3) NULL,
	[precioSinImpuestos] [numeric](5, 3) NULL,
PRIMARY KEY CLUSTERED 
(
	[idDetalle] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[detalleFactura]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detalleFactura](
	[idDetalle] [int] NOT NULL,
	[noFactura] [int] NOT NULL,
	[idProducto] [int] NOT NULL,
	[cantidadProducto] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idDetalle] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[detallePedido]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detallePedido](
	[idDetalleP] [int] NOT NULL,
	[idPedido] [int] NOT NULL,
	[idProducto] [int] NOT NULL,
	[cantidadProducto] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[idDetalleP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[documento]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[documento](
	[idDocumento] [int] NOT NULL,
	[nombre] [varchar](80) NULL,
	[estado] [varchar](80) NULL,
PRIMARY KEY CLUSTERED 
(
	[idDocumento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[documentoEmpleado]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[documentoEmpleado](
	[idDocumentoE] [int] NOT NULL,
	[idDocumento] [int] NOT NULL,
	[idEmpleado] [int] NOT NULL,
	[descripcion] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idDocumentoE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[estadoEmpleado]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[estadoEmpleado](
	[idEstado] [int] NOT NULL,
	[nombreEstado] [varchar](50) NULL,
	[descripcion] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[idEstado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[estadoPedido]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[estadoPedido](
	[idEstadoP] [int] NOT NULL,
	[nombre] [varchar](80) NULL,
	[descripcion] [varchar](120) NULL,
PRIMARY KEY CLUSTERED 
(
	[idEstadoP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[factura]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[factura](
	[noFactura] [int] NOT NULL,
	[numRegistro] [int] NOT NULL,
	[fecha] [date] NULL,
	[idEmpleado] [int] NOT NULL,
	[idCliente] [int] NOT NULL,
	[montoTotal] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[noFactura] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[inventario]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[inventario](
	[idInventario] [int] NOT NULL,
	[idProductos] [int] NOT NULL,
	[idTipoT] [int] NOT NULL,
	[fechaTransaccion] [date] NULL,
	[precioCompra] [float] NULL,
	[porcentajeGanacia] [float] NULL,
	[stock] [int] NOT NULL,
	[cantidad] [int] NOT NULL,
	[impuestos] [float] NULL,
	[estado] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idInventario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[notasCreditoFiscal]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[notasCreditoFiscal](
	[noNCredito] [int] NOT NULL,
	[noCredito_fiscal] [int] NOT NULL,
	[descripcion] [varchar](120) NULL,
	[nit] [int] NOT NULL,
	[fecha] [datetime] NULL,
	[fechaVencimiento] [datetime] NULL,
	[totalDevuelto] [numeric](5, 3) NULL,
PRIMARY KEY CLUSTERED 
(
	[noNCredito] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[pedido]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pedido](
	[idPedido] [int] NOT NULL,
	[fecha] [date] NULL,
	[fecha_vencimiento] [date] NULL,
	[idEstadoP] [int] NOT NULL,
	[idCliente] [int] NOT NULL,
	[monto_total] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[idPedido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[privilegio]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[privilegio](
	[idPrivilegio] [int] NOT NULL,
	[verInventario] [bit] NULL,
	[construirEquipo] [bit] NULL,
	[verProductos] [bit] NULL,
	[solicitarAyuda] [bit] NULL,
	[verOrdenesCola] [bit] NULL,
	[verCajaVirtual] [bit] NULL,
	[verVentasUuario] [bit] NULL,
	[chatCenter] [bit] NULL,
	[cambiarDatosEmpresa] [bit] NULL,
	[gestionarVentas] [bit] NULL,
	[gestionarBitacoras] [bit] NULL,
	[gestionarClientes] [bit] NULL,
	[gestionarProveedores] [bit] NULL,
	[gestionarEmpleados] [bit] NULL,
	[gestionarProductos] [bit] NULL,
	[gestionarInventario] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[idPrivilegio] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[producto]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[producto](
	[idProducto] [int] NOT NULL,
	[nombreProducto] [varchar](60) NOT NULL,
	[descripcion] [text] NULL,
	[imagen] [varchar](200) NULL,
	[idProveedor] [int] NOT NULL,
	[idCategoria] [int] NOT NULL,
	[puntajeBenchMark] [numeric](12, 0) NULL,
PRIMARY KEY CLUSTERED 
(
	[idProducto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[proveedor]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[proveedor](
	[idProveedor] [int] NOT NULL,
	[nombreProveedor] [varchar](60) NOT NULL,
	[direccion] [varchar](120) NULL,
	[telefono] [int] NOT NULL,
	[fax] [int] NULL,
	[correoElectronico] [varchar](70) NULL,
	[idRubro] [int] NULL,
	[estado] [varchar](65) NULL,
PRIMARY KEY CLUSTERED 
(
	[idProveedor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[rubroProveedor]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[rubroProveedor](
	[idRubro] [int] NOT NULL,
	[nombreRubro] [varchar](160) NOT NULL,
	[descripcion] [varchar](250) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idRubro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tipoTransaccion]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tipoTransaccion](
	[idTipoT] [int] NOT NULL,
	[nombre] [varchar](60) NULL,
PRIMARY KEY CLUSTERED 
(
	[idTipoT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tipoUsuario]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tipoUsuario](
	[idTipo] [int] NOT NULL,
	[nombreTipo] [varchar](60) NULL,
	[idPrivilegio] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idTipo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[usuarioEmpleado]    Script Date: 20/8/2018 05:43:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[usuarioEmpleado](
	[idEmpleado] [int] NOT NULL,
	[idTipo] [int] NOT NULL,
	[nombres] [varchar](150) NOT NULL,
	[apellidos] [varchar](150) NOT NULL,
	[telefono] [int] NOT NULL,
	[correoElectronico] [varchar](70) NOT NULL,
	[contraseña] [varchar](80) NOT NULL,
	[direccion] [varchar](120) NOT NULL,
	[idEstado] [int] NOT NULL,
	[imagen] [varchar](200) NULL,
	[pregunta1] [varchar](300) NULL,
	[respuesta1] [varchar](150) NULL,
	[pregunta2] [varchar](300) NULL,
	[respuesta2] [varchar](150) NULL,
PRIMARY KEY CLUSTERED 
(
	[idEmpleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[bitacoraCliente]  WITH CHECK ADD FOREIGN KEY([idCliente])
REFERENCES [dbo].[cliente] ([idCliente])
GO
ALTER TABLE [dbo].[bitacoraEmpleado]  WITH CHECK ADD FOREIGN KEY([idEmpleado])
REFERENCES [dbo].[usuarioEmpleado] ([idEmpleado])
GO
ALTER TABLE [dbo].[creditoFiscal]  WITH CHECK ADD FOREIGN KEY([idCliente])
REFERENCES [dbo].[cliente] ([idCliente])
GO
ALTER TABLE [dbo].[creditoFiscal]  WITH CHECK ADD FOREIGN KEY([idEmpleado])
REFERENCES [dbo].[usuarioEmpleado] ([idEmpleado])
GO
ALTER TABLE [dbo].[creditoFiscal]  WITH CHECK ADD FOREIGN KEY([numRegistro])
REFERENCES [dbo].[datosEmpresa] ([numRegistro])
GO
ALTER TABLE [dbo].[detalleCreditoFiscal]  WITH CHECK ADD FOREIGN KEY([idProducto])
REFERENCES [dbo].[producto] ([idProducto])
GO
ALTER TABLE [dbo].[detalleCreditoFiscal]  WITH CHECK ADD FOREIGN KEY([noCreditoFiscal])
REFERENCES [dbo].[creditoFiscal] ([noCreditoFiscal])
GO
ALTER TABLE [dbo].[detalleFactura]  WITH CHECK ADD FOREIGN KEY([idProducto])
REFERENCES [dbo].[producto] ([idProducto])
GO
ALTER TABLE [dbo].[detalleFactura]  WITH CHECK ADD FOREIGN KEY([noFactura])
REFERENCES [dbo].[factura] ([noFactura])
GO
ALTER TABLE [dbo].[detallePedido]  WITH CHECK ADD FOREIGN KEY([idPedido])
REFERENCES [dbo].[pedido] ([idPedido])
GO
ALTER TABLE [dbo].[detallePedido]  WITH CHECK ADD FOREIGN KEY([idProducto])
REFERENCES [dbo].[producto] ([idProducto])
GO
ALTER TABLE [dbo].[documentoEmpleado]  WITH CHECK ADD FOREIGN KEY([idDocumento])
REFERENCES [dbo].[documento] ([idDocumento])
GO
ALTER TABLE [dbo].[documentoEmpleado]  WITH CHECK ADD FOREIGN KEY([idEmpleado])
REFERENCES [dbo].[usuarioEmpleado] ([idEmpleado])
GO
ALTER TABLE [dbo].[factura]  WITH CHECK ADD FOREIGN KEY([idCliente])
REFERENCES [dbo].[cliente] ([idCliente])
GO
ALTER TABLE [dbo].[factura]  WITH CHECK ADD FOREIGN KEY([idEmpleado])
REFERENCES [dbo].[usuarioEmpleado] ([idEmpleado])
GO
ALTER TABLE [dbo].[factura]  WITH CHECK ADD FOREIGN KEY([numRegistro])
REFERENCES [dbo].[datosEmpresa] ([numRegistro])
GO
ALTER TABLE [dbo].[inventario]  WITH CHECK ADD FOREIGN KEY([idProductos])
REFERENCES [dbo].[producto] ([idProducto])
GO
ALTER TABLE [dbo].[inventario]  WITH CHECK ADD FOREIGN KEY([idTipoT])
REFERENCES [dbo].[tipoTransaccion] ([idTipoT])
GO
ALTER TABLE [dbo].[notasCreditoFiscal]  WITH CHECK ADD FOREIGN KEY([noCredito_fiscal])
REFERENCES [dbo].[creditoFiscal] ([noCreditoFiscal])
GO
ALTER TABLE [dbo].[pedido]  WITH CHECK ADD FOREIGN KEY([idCliente])
REFERENCES [dbo].[cliente] ([idCliente])
GO
ALTER TABLE [dbo].[pedido]  WITH CHECK ADD FOREIGN KEY([idEstadoP])
REFERENCES [dbo].[estadoPedido] ([idEstadoP])
GO
ALTER TABLE [dbo].[producto]  WITH CHECK ADD FOREIGN KEY([idCategoria])
REFERENCES [dbo].[categoriaProducto] ([idCategoria])
GO
ALTER TABLE [dbo].[producto]  WITH CHECK ADD FOREIGN KEY([idProveedor])
REFERENCES [dbo].[proveedor] ([idProveedor])
GO
ALTER TABLE [dbo].[proveedor]  WITH CHECK ADD FOREIGN KEY([idRubro])
REFERENCES [dbo].[rubroProveedor] ([idRubro])
GO
ALTER TABLE [dbo].[tipoUsuario]  WITH CHECK ADD FOREIGN KEY([idPrivilegio])
REFERENCES [dbo].[privilegio] ([idPrivilegio])
GO
ALTER TABLE [dbo].[usuarioEmpleado]  WITH CHECK ADD FOREIGN KEY([idEstado])
REFERENCES [dbo].[estadoEmpleado] ([idEstado])
GO
ALTER TABLE [dbo].[usuarioEmpleado]  WITH CHECK ADD FOREIGN KEY([idTipo])
REFERENCES [dbo].[tipoUsuario] ([idTipo])
GO
USE [master]
GO
ALTER DATABASE [dbInnovasys] SET  READ_WRITE 
GO
