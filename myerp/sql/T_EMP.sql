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

Date: 2018-10-02 11:58:52
*/


-- ----------------------------
-- Table structure for T_EMP
-- ----------------------------
DROP TABLE [dbo].[T_EMP]
GO
CREATE TABLE [dbo].[T_EMP] (
[ID] numeric(4) NOT NULL IDENTITY(1001,1) ,
[NAME] varchar(50) NOT NULL ,
[AGE] numeric(3) NULL ,
[SALARY] numeric(7,2) NULL ,
[DEPTNO] numeric(4) NULL ,
[COMM] numeric(7,2) NULL ,
[email] varchar(50) NULL ,
[hiredate] datetime NULL ,
[details] varchar(MAX) NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[T_EMP]', RESEED, 1383)
GO

-- ----------------------------
-- Records of T_EMP
-- ----------------------------
SET IDENTITY_INSERT [dbo].[T_EMP] ON
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1147', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1151', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1176', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1177', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1179', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1185', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1246', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1247', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1248', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1249', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1250', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1251', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1252', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1253', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1254', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1255', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1256', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1257', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1258', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1259', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1260', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1261', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1262', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1263', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1264', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1265', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1266', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1267', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1268', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1269', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1270', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1271', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1272', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1273', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1274', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1275', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1276', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1277', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1278', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1279', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1280', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1281', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1282', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1283', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1284', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1285', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1286', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1287', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1288', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1289', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1290', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1291', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1292', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1293', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1294', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1295', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1296', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1297', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1298', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1299', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1300', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1301', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1302', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1303', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1304', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1305', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1306', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1307', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1308', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1309', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1310', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1311', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1312', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1313', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1314', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1315', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1316', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1317', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1318', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1319', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1320', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1321', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1322', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1323', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1324', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1325', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1326', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1327', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1328', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1329', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1330', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1331', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1332', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1333', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1334', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1335', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1336', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1337', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1338', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1339', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1340', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1341', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1342', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1343', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1345', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1346', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1347', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1348', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1349', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1350', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1351', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1352', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1353', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1354', N'老严', N'25', N'6000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1355', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1356', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1357', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1358', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1359', N'小陈', N'26', N'8000.00', N'60', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1360', N'徐*祺', N'21', N'6000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1361', N'王*勇', N'23', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1363', N'*文杰', N'25', N'8000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1364', N'张js', N'23', N'12345.00', N'110', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1365', N'*青见', N'24', N'10000.00', N'20', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1366', N'小艾', N'23', N'9000.00', N'10', null, null, null, null)
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1367', N'小陈', N'26', N'7000.00', N'60', null, N'', N'2018-09-20 00:00:00.000', N'')
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1368', N'test', N'23', N'20000.00', N'20', null, N'876295854@qq.com', N'2018-09-03 00:00:00.000', N'&lt;div class="lemma_name" style="margin:0px 0px 10px;padding:0px 0px 0px 35px;zoom:1;float:left;width:434px;word-wrap:break-word;color:#333333;font-family:arial, ''pingfang sc'', stheiti, simsun, sans-serif;background-color:#ffffff;"&gt;&lt;h1 id="title" data-full-title="马化腾" data-search-text="马化腾" style="margin-top:0px;margin-right:10px;margin-bottom:0px;padding:0px;font-size:30px;font-weight:400;float:left;font-family:verdana, arial, ''pingfang sc'', stheiti, ''microsoft yahei'', sans-serif;line-height:34px;"&gt;马化腾&lt;/h1&gt;&lt;div class="lemma_focus_wrap" style="margin:0px;padding:0px;"&gt;&lt;a href="https://baike.sogou.com/lemma/CreateV1.e?sp=2&amp;amp;sp=l6242" class="btn_edit_lemma" style="float:left;display:block;margin-top:8px;padding-left:4px;width:80px;height:22px;line-height:20px;border:1px solid rgb(211, 211, 211);text-decoration-line:none;color:#999999;"&gt;编辑词条&lt;/a&gt;&lt;/div&gt;&lt;/div&gt;&lt;div class="abstract_main" style="margin:0px;padding:20px 35px;zoom:1;background-color:#ffffff;clear:both;color:#333333;font-family:arial, ''pingfang sc'', stheiti, simsun, sans-serif;"&gt;&lt;div class="side_wrap" style="margin:0px 20px 0px 0px;padding:0px;float:left;"&gt;&lt;div id="lemma_pic" class="lemma_pic" style="margin:0px 0px 5px;padding:5px;border:1px solid rgb(227, 227, 227);"&gt;&lt;a class="ed_image_link" title="点击查看大图" href="https://baike.sogou.com/PicBooklet.v?relateImageGroupIds=14286,14288,14289,14291,2896111,2763091,1645657,1645655&amp;amp;lemmaId=6242&amp;amp;now=https%3A%2F%2Fpic.baike.soso.com%2Fugc%2Fbaikepic2%2F18529%2F20180117103516-682569579_jpg_748_1055_52716.jpg%2F0&amp;amp;type=1" target="_blank" style="position:relative;display:block;color:#3366cc;text-decoration-line:none;"&gt;&lt;img title="马化腾" alt="" src="https://pic.baike.soso.com/ugc/baikepic2/18294/cut-20180117103525-225734964_jpg_476_595_27818.jpg/300" width="200" height="250" style="border:0px;display:inline-block;vertical-align:top;max-width:250px;max-height:250px;" /&gt;&lt;/a&gt;&lt;/div&gt;&lt;/div&gt;&lt;div class="abstract" style="margin:0px;padding:0px;line-height:25px;font-size:14px;"&gt;&lt;div class="edit_abstract" style="margin:0px;padding:0px;"&gt;&lt;/div&gt;&lt;p style="margin-bottom:0px;padding:0px;text-indent:2em;line-height:25px;"&gt;马化腾，1971年10月29日出生于海南省&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=64728640&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;东方市&lt;/a&gt;（原广东省海南岛东方县），腾讯公司主要创办人之一，现任腾讯公司控股&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=10657242&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;董事会主席&lt;/a&gt;兼首席执行官，全国青联副主席，第十三届全国人大代表，西湖大学创校荣誉校董会成员。&lt;/p&gt;&lt;p style="margin-bottom:0px;padding:0px;text-indent:2em;line-height:25px;"&gt;1984年随家人从海南迁至深圳，就读于&lt;a class="ed_inner_link" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=158033" target="_blank" ss_c="ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;深圳中学&lt;/a&gt;，1993年取得深大理科学士学位。1998年与&lt;a class="ed_inner_link" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=46945" target="_blank" ss_c="ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;张志东&lt;/a&gt;注册成立&amp;ldquo;&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=5914&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;深圳市腾讯计算机系统有限公司&lt;/a&gt;&amp;rdquo;。2015年2月13日入选&amp;ldquo;2014中国互联网年度人物&amp;rdquo;；3月2日以161亿美元位列2015年福布斯中国富豪榜单第六；4月位列《&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=122544&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;财富&lt;/a&gt;》2015"&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=164697568&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;中国最具影响力的50位商界领袖&lt;/a&gt;"排行榜第2位；10月以1030亿元位居2015&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=106370115&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;信中利&amp;middot;胡润IT富豪榜&lt;/a&gt;第二；10月26日以176亿美元位列&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=139428020&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;2015年福布斯中国富豪榜&lt;/a&gt;第三。2017年7月17日，以净资产324亿美元位列《&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=75905&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;福布斯富豪榜&lt;/a&gt;》第23位；8月7日马化腾身家361亿美元成为&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=114871&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;中国首富&lt;/a&gt;。&lt;/p&gt;&lt;p style="margin-bottom:0px;padding:0px;text-indent:2em;line-height:25px;"&gt;2018年7月，《福布斯》发布2018&lt;a class="ed_inner_link" target="_blank" href="https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=143469963&amp;amp;ss_c=ssc.citiao.link" style="color:#3366cc;text-decoration-line:none;"&gt;中国慈善榜&lt;/a&gt;，马化腾以82000万元排名第4。&lt;/p&gt;&lt;/div&gt;&lt;/div&gt;&lt;br /&gt;')
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1373', N'张国荣', N'30', N'10000.00', N'190', null, N'265647326487@qq.com', N'2018-09-28 13:42:00.000', N'香港中文大学')
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1375', N'123', N'1', N'1.00', N'20', null, N'opww@163.com', N'2018-09-28 00:00:00.000', N'')
GO
GO
INSERT INTO [dbo].[T_EMP] ([ID], [NAME], [AGE], [SALARY], [DEPTNO], [COMM], [email], [hiredate], [details]) VALUES (N'1383', N'袁色宝', N'23', N'8000.00', N'80', null, N'1284833560@qq.com', N'2018-09-28 13:55:00.000', N'')
GO
GO
SET IDENTITY_INSERT [dbo].[T_EMP] OFF
GO

-- ----------------------------
-- Indexes structure for table T_EMP
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table T_EMP
-- ----------------------------
ALTER TABLE [dbo].[T_EMP] ADD PRIMARY KEY ([ID])
GO
