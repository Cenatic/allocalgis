INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
1, 'apertura', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
2, 'tramitacion', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
3, 'cierre', NULL, 2); 



INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
9, 'NotificacionDenegacion', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
12, 'Ejecucion', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
13, 'Durmiente', NULL, 2); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
7, 'ActualizacionInformeResolucion', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
1, 'AperturaExpediente', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
2, 'MejoraDatos', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
3, 'SolicitudInformes', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
4, 'EsperaInformes', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
5, 'EmisionInformeResolucion', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
6, 'EsperaAlegaciones', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
8, 'EmisionPropuestaResolucion', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
10, 'FormalizacionLicencia', NULL, 1); 
INSERT INTO ESTADO ( ID_ESTADO, DESCRIPCION, OBSERVACION, STEP ) VALUES ( 
11, 'NotificacionAprobacion', NULL, 1); 
 
INSERT INTO ESTADO_NOTIFICACION ( ID_ESTADO, DESCRIPCION,
OBSERVACION ) VALUES (
0, 'Pendiente Notificar', NULL);
INSERT INTO ESTADO_NOTIFICACION ( ID_ESTADO, DESCRIPCION,
OBSERVACION ) VALUES (
1, 'En espera acuse env�o', NULL);
INSERT INTO ESTADO_NOTIFICACION ( ID_ESTADO, DESCRIPCION,
OBSERVACION ) VALUES (
2, 'En espera acuse reenv�o', NULL);
INSERT INTO ESTADO_NOTIFICACION ( ID_ESTADO, DESCRIPCION,
OBSERVACION ) VALUES (
3, 'Notificado', NULL);
 
INSERT INTO ESTADO_RESOLUCION ( ID_ESTADO, DESCRIPCION, OBSERVACION ) VALUES ( 
0, 'Pendiente resoluci�n', NULL); 
INSERT INTO ESTADO_RESOLUCION ( ID_ESTADO, DESCRIPCION, OBSERVACION ) VALUES ( 
1, 'Pendiente conformidad', NULL); 
INSERT INTO ESTADO_RESOLUCION ( ID_ESTADO, DESCRIPCION, OBSERVACION ) VALUES ( 
2, 'Resuelto', NULL); 
 
 
 
 
INSERT INTO TIPO_ANEXO ( ID_TIPO_ANEXO, DESCRIPCION, OBSERVACION ) VALUES ( 
0, 'Licencia de obra', NULL); 
INSERT INTO TIPO_ANEXO ( ID_TIPO_ANEXO, DESCRIPCION, OBSERVACION ) VALUES ( 
2, 'Planos Urban�sticos', NULL); 
INSERT INTO TIPO_ANEXO ( ID_TIPO_ANEXO, DESCRIPCION, OBSERVACION ) VALUES ( 
3, 'Mapas', NULL); 
INSERT INTO TIPO_ANEXO ( ID_TIPO_ANEXO, DESCRIPCION, OBSERVACION ) VALUES ( 
4, 'Ingenier�a', NULL); 
INSERT INTO TIPO_ANEXO ( ID_TIPO_ANEXO, DESCRIPCION, OBSERVACION ) VALUES ( 
5, 'Estudio Ambiental', NULL); 
INSERT INTO TIPO_ANEXO ( ID_TIPO_ANEXO, DESCRIPCION, OBSERVACION ) VALUES ( 
1, 'Registro', NULL); 
 
INSERT INTO TIPO_FINALIZACION ( ID_FINALIZACION, DESCRIPCION, OBSERVACION ) VALUES ( 
0, 'Por resoluci�n expresa', NULL); 
INSERT INTO TIPO_FINALIZACION ( ID_FINALIZACION, DESCRIPCION, OBSERVACION ) VALUES ( 
1, 'Por silencio administrativo', NULL); 
 
INSERT INTO TIPO_INFORME ( ID_TIPO_INFORME, OBSERVACION, DESCRIPCION ) VALUES ( 
0, NULL, 'T�cnico'); 
INSERT INTO TIPO_INFORME ( ID_TIPO_INFORME, OBSERVACION, DESCRIPCION ) VALUES ( 
1, NULL, 'Jur�dico'); 
 
INSERT INTO TIPO_LICENCIA ( ID_TIPO_LICENCIA, DESCRIPCION,
OBSERVACION ) VALUES ( 
0, 'Licencia de obra mayor', NULL); 
INSERT INTO TIPO_LICENCIA ( ID_TIPO_LICENCIA, DESCRIPCION,
OBSERVACION ) VALUES ( 
2, 'Licencia de actividad', NULL); 
INSERT INTO TIPO_LICENCIA ( ID_TIPO_LICENCIA, DESCRIPCION,
OBSERVACION ) VALUES ( 
1, 'Licencia de obra menor', NULL); 
 
INSERT INTO TIPO_NOTIFICACION ( ID_TIPO_NOTIFICACION, DESCRIPCION,
OBSERVACION ) VALUES ( 
0, 'Ordinaria', 'Notificaci�n ordinaria en el trascurso de la tramitaci�n del expediente'); 
INSERT INTO TIPO_NOTIFICACION ( ID_TIPO_NOTIFICACION, DESCRIPCION,
OBSERVACION ) VALUES ( 
1, 'Extraordinaria', 'Notificaci�n por alg�n motivo extraordinario a la tramitaci�n del expediente.'); 
 
INSERT INTO TIPO_OBRA ( ID_TIPO_OBRA, DESCRIPCION, OBSERVACION ) VALUES ( 
0, 'Nueva planta', 'Nueva planta.'); 
INSERT INTO TIPO_OBRA ( ID_TIPO_OBRA, DESCRIPCION, OBSERVACION ) VALUES ( 
1, 'Rehabilitaci�n', 'Rehabilitaci�n de fachadas y estructura interna de un edificio.'); 
INSERT INTO TIPO_OBRA ( ID_TIPO_OBRA, DESCRIPCION, OBSERVACION ) VALUES ( 
2, 'Demolici�n', 'Demolici�n de un edificio.'); 
 
INSERT INTO TIPO_TRAMITACION ( ID_TRAMITACION, DESCRIPCION, OBSERVACION,
PLAZO_ENTREGA ) VALUES ( 
0, 'Ordinaria', NULL, NULL); 
INSERT INTO TIPO_TRAMITACION ( ID_TRAMITACION, DESCRIPCION, OBSERVACION,
PLAZO_ENTREGA ) VALUES ( 
1, 'Urgente', NULL, NULL); 
 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 7, 8, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 8, 8, NULL, NULL, 'Expediente en estado de emisi�n de propuesta de resoluci�n. Acciones: evaluar tipo de propuesta: si positiva, pasar a formalizaci�n de licencia. Si negativa, pasar a notificar denegaci�n.','Hito estado: 60%', 'Expediente en espera de la propuesta de resoluci�n.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 8, 9, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 8, 10, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 9, 9, NULL, NULL, 'Expediente en estado de notificaci�n de denegaci�n. Acciones: notificar a los interesados y pasar a durmiente.','Hito estado: 67%', 'Expediente Denegado.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 9, 13, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 10, 10, NULL, NULL, 'Expediente en estado de formalizaci�n de licencia. Acciones: formalizar licencia.','Hito estado: 75%', 'Formalizaci�n de la licencia.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 10, 11, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 11, 11, NULL, NULL, 'Expediente en estado de notificaci�n de aprobaci�n. Acciones: notificar a los interesados y pasar el expediente a ejecuci�n.','Hito estado: 82%', 'Expediente Aprobado.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 11, 12, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 12, 12, 10, 13, '','Hito estado: 90%', 'Expediente en estado de ejecuci�n.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 12, 13, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 13, 13, NULL, NULL, 'Expediente ha pasado a estado durmiente.','Hito estado: 100%', 'Expediente expirado.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 0, 1, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 1, 1, NULL, NULL, 'Expediente en estado de apertura. Acciones: revisar la documentaci�n asociada y solicitar informes t�cnicos o iniciar proceso de mejora de datos.','Hito estado: 07%', 'Se ha producido la apertura de expediente.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 1, 2, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 1, 3, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 2, 2, 10, 13, 'Expediente en estado de mejora. Acciones: notificar a los interesados, recibir la nueva documentaci�n, revisarla y solicitar informes o deshechar el expediente.','Hito estado: 15%', 'Expediente en mejora de Datos.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 2, 3, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 3, 3, NULL, NULL, 'Expediente en estado de solicitud de informes. Acciones: realizar la petici�n de informes, y quedar en espera de recibirlos.','Hito estado: 22%', 'Solicitud de informes jur�dico-t�cnicos.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 3, 4, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 4, 4, NULL, NULL, '','Hito estado: 30%', 'Expediente en espera de informes jur�dico-t�cnicos.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 4, 5, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 5, 5, NULL, NULL, 'Expediente en estado de emision de informe de resoluci�n. Acciones: emitir informe positivo y pasar a emisi�n de propuesta de resoluci�n, o informe negativo y esperar alegaciones.','Hito estado: 37%', 'Resoluci�n de expediente.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 5, 6, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 5, 8, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 6, 6, 10, 7, 'Expediente en estado de espera de alegaciones. Acciones: notificar alos interesados, recibir alegaciones y pasar a actualizaci�n de informe de resoluci�n.','Hito estado: 45%', 'Expediente en espera de alegaciones.', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, CRUTAACC, CNOM ) VALUES ( 6, 7, NULL, NULL, '', '', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
INSERT INTO WORKFLOW ( ID_ESTADO, ID_NEXTESTADO, PLAZO, ID_PLAZOESTADO, EVENT_TEXT, HITO_TEXT, NOTIF_TEXT, CRUTAACC, CNOM ) VALUES ( 7, 7, NULL, NULL, '','Hito estado: 52%', 'Actualizaci�n del informe de resoluci�n', 'C:\\jboss-3.2.3\\geopista' , 'Notificacion.doc'); 
commit;

INSERT INTO VIA_NOTIFICACION ( ID_VIA_NOTIFICACION, OBSERVACION ) VALUES ( 
0, 'correo ordinario'); 
INSERT INTO VIA_NOTIFICACION ( ID_VIA_NOTIFICACION, OBSERVACION ) VALUES ( 
1, 'email'); 
 

update domains set name='TIPO_OCUPACION' where id=68
commit;