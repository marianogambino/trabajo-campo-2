--   ------------------------------------------- 
--   Generated by Enterprise Architect Ver. 4.01
--   Created On : S�bado, 18 Abril, 2009 
--   DBMS       : Oracle 
--   ------------------------------------------- 




--  Create Tables 
CREATE TABLE Cliente ( 
	PER_ID NUMBER(12) NOT NULL
) 
;

CREATE TABLE Consumo ( 
	CON_ID NUMBER(12) NOT NULL,
	CON_FECHA_CONSUMO DATE NOT NULL,
	CON_KWH NUMBER(12,2) NOT NULL,
	CON_PDS_ID NUMBER(12),
	CON_USU_ULT_MOD VARCHAR(50) NOT NULL,
	CON_USU_FEHCA_ULT_MOD DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Empleado ( 
	PER_ID NUMBER(12) NOT NULL,
	EMP_USU_ID NUMBER(12)
) 
;

CREATE TABLE Estado_Medidor ( 
	EMD_ID NUMBER(12) NOT NULL,
	EMD_DESCRIPCION_ESTADO VARCHAR(200),
	EMD_FECHA DATE NOT NULL,
	EMD_LECTURA_MEDIDOR NUMBER(12) NOT NULL,
	EMD_TEM_ID NUMBER(12) NOT NULL,
	EMD_MED_ID NUMBER(12) NOT NULL,
	EMD_USU_ULT_MOD VARCHAR(50) NOT NULL,
	EMD_FECHA_ULT_MOD DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Factura ( 
	FAC_ID NUMBER(12) NOT NULL,
	FAC_FECHA_EMISION DATE NOT NULL,
	FAC_FECHA_VEC DATE NOT NULL,
	FAC_IMPORTE NUMBER(12,2) NOT NULL,
	FAC_TOTAL_PAGAR NUMBER(12,2) NOT NULL,
	FAC_CLI_ID NUMBER(12) NOT NULL,
	FAC_CON_ID NUMBER(12) NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Impuesto ( 
	IMP_ID NUMBER(12) NOT NULL,
	IMP_VALOR_PORCENTAJE NUMBER(3,2) NOT NULL,
	IMP_DESCRIPCION VARCHAR(50),
	IMP_ESTADO VARCHAR(1) NOT NULL,
	IMP_USU_ULT_MOD VARCHAR(50) NOT NULL,
	IMP_FECHA_ULT_MOD DATE NOT NULL,
	IMP_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Localidad ( 
	LOC_ID NUMBER(12) NOT NULL,
	LOC_NOMBRE VARCHAR2(50),
	LOC_CP VARCHAR2(10),
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Medidor ( 
	MED_ID NUMBER(12) NOT NULL,
	MED_DESCRIPCION VARCHAR(50),
	MED_ASIGNADO CHAR(1) DEFAULT 0 NOT NULL,
	MED_ESTADO VARCHAR(1) NOT NULL,
	MED_USU_ULT_MOD VARCHAR(50) NOT NULL,
	MED_FECHA_ULT_MOD DATE NOT NULL,
	MED_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Persona ( 
	PER_ID NUMBER(12) NOT NULL,
	PER_NOMBRE VARCHAR2(50),
	PER_APELLIDO VARCHAR2(50),
	PER_DNI VARCHAR2(20) NOT NULL,
	PER_TELEFONO VARCHAR2(10),
	PER_EMAIL VARCHAR2(50),
	PER_TELEFONO2 VARCHAR2(50),
	PER_TYPE VARCHAR(1) NOT NULL,
	PER_ESTADO VARCHAR(1) NOT NULL,
	PER_USU_ULT_MOD VARCHAR(50) NOT NULL,
	PER_FECHA_ULT_MOD DATE NOT NULL,
	PER_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Punto_De_Suministro ( 
	PDS_ID NUMBER(12) NOT NULL,
	PDS_NUMERO VARCHAR2(50),
	PDS_CALLE VARCHAR2(50),
	PDS_ENTRE_CALLE1 VARCHAR2(50),
	PDS_ENTRE_CALLE2 VARCHAR2(50),
	PDS_POTENCIA_INSTALADA NUMBER(8,2),
	PDS_TPS_ID NUMBER(12) NOT NULL,
	PDS_MED_ID NUMBER(12) NOT NULL,
	PDS_LOC_ID NUMBER(12) NOT NULL,
	PDS_CLI_ID NUMBER(12) NOT NULL,
	PDS_ESTADO VARCHAR(1) NOT NULL,
	PDS_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	PDS_USU_ULT_MOD VARCHAR2(50),
	PDS_FECHA_ULT_MOD DATE,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Tarifa ( 
	TAR_ID NUMBER(12) NOT NULL,
	TAR_PRECIO_KWH NUMBER(12,2) NOT NULL,
	TAR_CARGO_FIJO NUMBER(12,2) NOT NULL,
	TAR_TTF_ID NUMBER(12) NOT NULL,
	TAR_ESTADO VARCHAR(1) NOT NULL,
	TAR_USU_ULT_MOD VARCHAR(50) NOT NULL,
	TAR_FECHA_ULT_MOD DATE NOT NULL,
	TAR_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Tipo_Estado_Medidor ( 
	TEM_ID NUMBER(12) NOT NULL,
	TEM_DESCRIPCION VARCHAR(50) NOT NULL,
	TEM_USU_ULT_MOD VARCHAR(50) NOT NULL,
	TEM_FECHA_ULT_MOD DATE NOT NULL,
	TEM_ESTADO VARCHAR(1) NOT NULL,
	TEM_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTORL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Tipo_Punto_Suministro ( 
	TPS_ID NUMBER(12) NOT NULL,
	TPS_DESCRIPCION VARCHAR(50),
	TPS_ESTADO VARCHAR(1) NOT NULL,
	TPS_TAR_ID NUMBER(12) NOT NULL,
	TPS_USU_ULT_MOD VARCHAR(50) NOT NULL,
	TPS_FECHA_ULT_MOD DATE NOT NULL,
	TPS_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE Tipo_Tarifa ( 
	TTF_ID NUMBER(12) NOT NULL,
	TTF_DESCRIPCION VARCHAR(50),
	TTF_ESTADO VARCHAR(1) NOT NULL,
	TTF_USU_ULT_MOD VARCHAR(50) NOT NULL,
	TTF_FECHA_ULT_MOD DATE NOT NULL,
	TTF_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;

CREATE TABLE TipoTarifa_Impuesto ( 
	TTI_IMP_ID NUMBER(12) NOT NULL,
	TTI_IMP_TTF_ID NUMBER(12) NOT NULL,
	TTI_IMP_IMP_ID NUMBER(12) NOT NULL
) 
;

CREATE TABLE Usuario ( 
	USU_ID NUMBER(8) NOT NULL,
	USU_NOMBRE VARCHAR2(50) NOT NULL,
	USU_PASSWORD VARCHAR2(50) NOT NULL,
	USU_TIPO_PERMISO VARCHAR(50) NOT NULL,
	USU_ESTADO VARCHAR(1) NOT NULL,
	USU_ULT_MOD VARCHAR(50) NOT NULL,
	USU_FECHA_ULT_MODIF DATE NOT NULL,
	USU_FECHA_CAMBIO_ESTADO DATE NOT NULL,
	LOCK_CONTROL NUMBER(12) DEFAULT 0 NOT NULL
) 
;


--  Create Primary Key Constraints 
ALTER TABLE Cliente ADD CONSTRAINT PK_Cliente 
PRIMARY KEY (PER_ID) 
;

ALTER TABLE Consumo ADD CONSTRAINT PK_Consumo 
PRIMARY KEY (CON_ID) 
;

ALTER TABLE Empleado ADD CONSTRAINT PK_Empleado 
PRIMARY KEY (PER_ID) 
;

ALTER TABLE Estado_Medidor ADD CONSTRAINT PK_EstadoMedidor 
PRIMARY KEY (EMD_ID) 
;

ALTER TABLE Factura ADD CONSTRAINT PK_Factura 
PRIMARY KEY (FAC_ID) 
;

ALTER TABLE Impuesto ADD CONSTRAINT PK_Impuesto 
PRIMARY KEY (IMP_ID) 
;

ALTER TABLE Localidad ADD CONSTRAINT PK_Localidad 
PRIMARY KEY (LOC_ID) 
;

ALTER TABLE Medidor ADD CONSTRAINT PK_Medidor 
PRIMARY KEY (MED_ID) 
;

ALTER TABLE Persona ADD CONSTRAINT PERSONA_PK_001 
PRIMARY KEY (PER_ID) 
;

ALTER TABLE Tarifa ADD CONSTRAINT PK_Tarifa 
PRIMARY KEY (TAR_ID) 
;

ALTER TABLE Tipo_Estado_Medidor ADD CONSTRAINT PK_TipoEstadoMedidor 
PRIMARY KEY (TEM_ID) 
;

ALTER TABLE Tipo_Punto_Suministro ADD CONSTRAINT PK_TipoPuntoSuministro 
PRIMARY KEY (TPS_ID) 
;

ALTER TABLE Tipo_Tarifa ADD CONSTRAINT PK_TipoTarifa 
PRIMARY KEY (TTF_ID) 
;

ALTER TABLE TipoTarifa_Impuesto ADD CONSTRAINT PK_TipoTarifa_Impuesto 
PRIMARY KEY (TTI_IMP_ID) 
;

ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
PRIMARY KEY (USU_ID) 
;


--  Create Indexes 
ALTER TABLE Cliente
ADD CONSTRAINT UQ_Cliente_CLI_ID UNIQUE (PER_ID)
;
ALTER TABLE Cliente
ADD CONSTRAINT UQ_Cliente_PER_ID UNIQUE (PER_ID)
;
ALTER TABLE Consumo
ADD CONSTRAINT UQ_Consumo_CON_PDS_ID UNIQUE (CON_PDS_ID)
;
ALTER TABLE Consumo
ADD CONSTRAINT UQ_Consumo_CON_PTS_ID UNIQUE (CON_PDS_ID)
;
ALTER TABLE Empleado
ADD CONSTRAINT UQ_Empleado_PER_ID UNIQUE (PER_ID)
;
ALTER TABLE Empleado
ADD CONSTRAINT UQ_Empleado_EMP_ID UNIQUE (PER_ID)
;
ALTER TABLE Medidor
ADD CONSTRAINT UQ_Medidor_MED_ID UNIQUE (MED_ID)
;
ALTER TABLE Persona
ADD CONSTRAINT UQ_Persona_PER_ID UNIQUE (PER_ID)
;
ALTER TABLE Persona
ADD CONSTRAINT UQ_Persona_DNI UNIQUE (PER_DNI)
;
ALTER TABLE Persona
ADD CONSTRAINT UQ_Persona_dni UNIQUE (PER_DNI)
;
ALTER TABLE Punto_De_Suministro
ADD CONSTRAINT UQ_PuntoDeSuminist_PDS_MED_ID UNIQUE (PDS_MED_ID)
;
ALTER TABLE Punto_De_Suministro
ADD CONSTRAINT PuntoDeSuministro_UQ_001 UNIQUE (PDS_ID)
;
ALTER TABLE Tarifa
ADD CONSTRAINT UQ_Tarifa_TAR_TTF_ID UNIQUE (TAR_TTF_ID)
;
ALTER TABLE Tipo_Punto_Suministro
ADD CONSTRAINT UQ_TipoPuntoSumi_TPS_TAR_ID_F UNIQUE (TPS_TAR_ID)
;
ALTER TABLE Tipo_Punto_Suministro
ADD CONSTRAINT UQ_TipoPuntoSumini_TPS_TAR_ID UNIQUE (TPS_TAR_ID)
;
ALTER TABLE Tipo_Punto_Suministro
ADD CONSTRAINT UQ_TipoPuntoSuministro_id UNIQUE (TPS_ID)
;
ALTER TABLE Tipo_Punto_Suministro
ADD CONSTRAINT UQ_TipoPuntoSuministro_TPS_ID UNIQUE (TPS_ID)
;
ALTER TABLE Usuario
ADD CONSTRAINT UQ_Usuario_USU_NOMBRE UNIQUE (USU_NOMBRE)
;
ALTER TABLE Usuario
ADD CONSTRAINT UQ_Usuario_USU_PASSWORD UNIQUE (USU_PASSWORD)
;


--  Create Foreign Key Constraints 
ALTER TABLE Consumo ADD CONSTRAINT FK_Punto_Suministro 
FOREIGN KEY (CON_PDS_ID) REFERENCES Punto_De_Suministro (PDS_ID)
;

ALTER TABLE Empleado ADD CONSTRAINT FK_EMP_USU_ID 
FOREIGN KEY (EMP_USU_ID) REFERENCES Usuario (USU_ID)
;

ALTER TABLE Estado_Medidor ADD CONSTRAINT FK_EstadoMedidor_001 
FOREIGN KEY (EMD_TEM_ID) REFERENCES Tipo_Estado_Medidor (TEM_ID)
;

ALTER TABLE Factura ADD CONSTRAINT FK_Cliente 
FOREIGN KEY (FAC_CLI_ID) REFERENCES Cliente (PER_ID)
;

ALTER TABLE Factura ADD CONSTRAINT FK_Consumo 
FOREIGN KEY (FAC_CON_ID) REFERENCES Consumo (CON_ID)
;

ALTER TABLE Punto_De_Suministro ADD CONSTRAINT PuntoDeSuministro_FK_001 
FOREIGN KEY (PDS_TPS_ID) REFERENCES Tipo_Punto_Suministro (TPS_ID)
;

ALTER TABLE Punto_De_Suministro ADD CONSTRAINT PuntoDeSuministro_FK_003 
FOREIGN KEY (PDS_LOC_ID) REFERENCES Localidad (LOC_ID)
;

ALTER TABLE Punto_De_Suministro ADD CONSTRAINT PuntoDeSuministro_FK_002 
FOREIGN KEY (PDS_MED_ID) REFERENCES Medidor (MED_ID)
;

ALTER TABLE Punto_De_Suministro ADD CONSTRAINT PuntoDeSuministro_FK_004 
FOREIGN KEY (PDS_CLI_ID) REFERENCES Cliente (PER_ID)
;

ALTER TABLE Tarifa ADD CONSTRAINT TAR_TTF_ID_FK_001 
FOREIGN KEY (TAR_TTF_ID) REFERENCES Tipo_Tarifa (TTF_ID)
;

ALTER TABLE Tipo_Punto_Suministro ADD CONSTRAINT TPS_TAR_ID_FK_001 
FOREIGN KEY (TPS_TAR_ID) REFERENCES Tarifa (TAR_ID)
;

ALTER TABLE TipoTarifa_Impuesto ADD CONSTRAINT FK_TTF_IMP_001 
FOREIGN KEY (TTI_IMP_TTF_ID) REFERENCES Tipo_Tarifa (TTF_ID)
;

ALTER TABLE TipoTarifa_Impuesto ADD CONSTRAINT FK_TTF_IMP_002 
FOREIGN KEY (TTI_IMP_IMP_ID) REFERENCES Impuesto (IMP_ID)
;
