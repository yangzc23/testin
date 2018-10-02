/*
Navicat SQL Server Data Transfer

Source Server         : sqlserver_local
Source Server Version : 130000
Source Host           : 127.0.0.1:1433
Source Database       : MYERP0612
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 130000
File Encoding         : 65001

Date: 2018-10-02 11:58:41
*/


-- ----------------------------
-- Table structure for T_USER
-- ----------------------------
DROP TABLE [dbo].[T_USER]
GO
CREATE TABLE [dbo].[T_USER] (
[ID] numeric(4) NOT NULL IDENTITY(1,1) ,
[USERNAME] varchar(50) NOT NULL ,
[PWD] varchar(50) NULL ,
[REALNAME] nvarchar(50) NOT NULL ,
[GENDER] bit NULL DEFAULT ((0)) ,
[SALT] varchar(50) NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[T_USER]', RESEED, 129)
GO

-- ----------------------------
-- Records of T_USER
-- ----------------------------
SET IDENTITY_INSERT [dbo].[T_USER] ON
GO
INSERT INTO [dbo].[T_USER] ([ID], [USERNAME], [PWD], [REALNAME], [GENDER], [SALT]) VALUES (N'129', N'12', N'f748b7cadc9a46b0c0b0bb7db50045eb', N'李李', null, N'5M0LKcPq7uq8CPUYkT3t1g==')
GO
GO
INSERT INTO [dbo].[T_USER] ([ID], [USERNAME], [PWD], [REALNAME], [GENDER], [SALT]) VALUES (N'125', N'admin', N'123456', N'管理员', null, null)
GO
GO
INSERT INTO [dbo].[T_USER] ([ID], [USERNAME], [PWD], [REALNAME], [GENDER], [SALT]) VALUES (N'128', N'sys', N'92e42b57c186583db43387d81237c344', N'管理员', null, N'fBpzve+jKhelT3sX+MIEPQ==')
GO
GO
SET IDENTITY_INSERT [dbo].[T_USER] OFF
GO

-- ----------------------------
-- Indexes structure for table T_USER
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table T_USER
-- ----------------------------
ALTER TABLE [dbo].[T_USER] ADD PRIMARY KEY ([USERNAME])
GO
