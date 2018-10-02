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

Date: 2018-10-02 11:59:02
*/


-- ----------------------------
-- Table structure for T_DEPT
-- ----------------------------
DROP TABLE [dbo].[T_DEPT]
GO
CREATE TABLE [dbo].[T_DEPT] (
[ID] numeric(4) NOT NULL IDENTITY(10,10) ,
[DNAME] nvarchar(50) NULL ,
[CITY] nvarchar(50) NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[T_DEPT]', RESEED, 1020)
GO

-- ----------------------------
-- Records of T_DEPT
-- ----------------------------
SET IDENTITY_INSERT [dbo].[T_DEPT] ON
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'10', N'销售部', N'上海')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'20', N'研发部', N'昆山')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'40', N'工程部', N'深圳')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'50', N'工程部', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'60', N'研发部', N'北京')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'80', N'施工部', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'90', N'施工部', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'100', N'施工部', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'110', N'研发部', N'深圳')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'120', N'施工部', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'130', N'施工部', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'140', N'研发部', N'苏州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'150', N'研发部', N'苏州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'160', N'工程中心', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'170', N'工程中心', N'广州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'180', N'研发部', N'苏州')
GO
GO
INSERT INTO [dbo].[T_DEPT] ([ID], [DNAME], [CITY]) VALUES (N'190', N'研发部', N'苏州')
GO
GO
SET IDENTITY_INSERT [dbo].[T_DEPT] OFF
GO

-- ----------------------------
-- Indexes structure for table T_DEPT
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table T_DEPT
-- ----------------------------
ALTER TABLE [dbo].[T_DEPT] ADD PRIMARY KEY ([ID])
GO
