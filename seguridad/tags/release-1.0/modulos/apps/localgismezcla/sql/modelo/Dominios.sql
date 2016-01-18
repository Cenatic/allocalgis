
SELECT setval('public.seq_dictionary', (select max(ID_VOCABLO)::bigint from DICTIONARY), true);
SELECT setval('public.seq_domains', (select max(id)::bigint from Domains), true);
SELECT setval('public.seq_domainnodes', (select max(id)::bigint from domainnodes), true);


-- Generar dominio PADRE EIEL
insert into Domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'EIEL',(select idacl FROM acl WHERE name='EIEL'),5);
SET @idDomainEiel= select currval('seq_domains') from seq_domains;

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','EIEL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','EIEL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','EIEL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','EIEL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','EIEL');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
 		 values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),2,null,null,null);
 SET @idDomainNodeEIEL= select currval('seq_domainnodes') from seq_domainnodes;
 
  ---GENERa dominio hijo (nombre de la tabla)
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Disponibilidad de agua',((select idacl FROM acl WHERE name='EIEL')),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Disponibilidad del agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Disponibilidad del agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Disponibilidad del agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Disponibilidad del agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Disponibilidad del agua');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sin Servicio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sin Servicio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sin Servicio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sin Servicio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sin Servicio');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiente');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tasa',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tasa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tasa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tasa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tasa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tasa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Cisterna',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Uso de cisterna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Uso de cisterna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Uso de cisterna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Uso de cisterna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Uso de cisterna');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
  		---Inserta dominio hijos
		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Accidente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Accidente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Accidente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Accidente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Accidente');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AC',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Inundaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Inundaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Inundaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Inundaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Inundaci�n');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mala calidad del agua');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mala calidad del agua');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mala calidad del agua');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mala calidad del agua');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mala calidad del agua');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No hay cisternas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No hay cisternas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No hay cisternas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No hay cisternas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No hay cisternas');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras causas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras causas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras causas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras causas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras causas');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Rotura');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Rotura');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Rotura');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Rotura');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Rotura');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Rutinario');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Rutinario');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Rutinario');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Rutinario');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Rutinario');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RU',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
  				
  			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sequ�a');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sequ�a');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sequ�a');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sequ�a');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sequ�a');
		
  			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SE',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Restricciones de agua',(select idacl FROM acl WHERE name='EIEL'),5);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Restricciones de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Restricciones de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Restricciones de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Restricciones de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Restricciones de agua');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sin restricciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sin restricciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sin restricciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sin restricciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sin restricciones');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Restricci�n parcial m�s de 8 horas/dia (Restricci�n fuerte)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Restricci�n parcial m�s de 8 horas/dia (Restricci�n fuerte)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Restricci�n parcial m�s de 8 horas/dia (Restricci�n fuerte)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Restricci�n parcial m�s de 8 horas/dia (Restricci�n fuerte)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Restricci�n parcial m�s de 8 horas/dia (Restricci�n fuerte)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RF',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Restricci�n parcial menos de 8 horas/dia (Restricci�n media)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Restricci�n parcial menos de 8 horas/dia (Restricci�n media)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Restricci�n parcial menos de 8 horas/dia (Restricci�n media)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Restricci�n parcial menos de 8 horas/dia (Restricci�n media)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Restricci�n parcial menos de 8 horas/dia (Restricci�n media)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RM',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Restriccion total');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Restriccion total');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Restriccion total');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Restriccion total');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Restriccion total');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RT',currval('seq_dictionary'),7,null,@idDomainNode,null);
------  			
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_alum_pl');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Reductor de flujo en la luminaria',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Reductor de flujo en la luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Reductor de flujo en la luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Reductor de flujo en la luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Reductor de flujo en la luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Reductor de flujo en la luminaria');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Reductor de flujo en la instalaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Reductor de flujo en la instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Reductor de flujo en la instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Reductor de flujo en la instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Reductor de flujo en la instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Reductor de flujo en la instalaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  			SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
------		
  				
--  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_abasta_au');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Suficiencia de caudal para el abastecimiento aut�nomo',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiencia de caudal para el abastecimiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiencia de caudal para el abastecimiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiencia de caudal para el abastecimiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiencia de caudal para el abastecimiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiencia de caudal para el abastecimiento aut�nomo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  			SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiente');
	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SF',currval('seq_dictionary'),7,null,@idDomainNode,null);


-------  													
 
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_nucl_encuest_1');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));


 -- Inserta dominio padre


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Accesibilidad del n�cleo de poblaci�n',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Accesibilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Accesibilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Accesibilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Accesibilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Accesibilidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  			
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Incomunicado');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Incomunicado Temporal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Incomunicado Temporal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Incomunicado Temporal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Incomunicado Temporal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Incomunicado Temporal');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IT',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No est� incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No est� incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No est� incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No est� incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No est� incomunicado');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
---			
  							 
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_ce');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

-- Inserta dominio padre

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad de cementerio',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  		---Inserta dominio hijos
  				--CR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Confesiones Religiosas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Confesiones Religiosas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Confesiones Religiosas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Confesiones Religiosas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Confesiones Religiosas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PV	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

 -- Inserta dominio padre

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Estado del acceso',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado del acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado del acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado del acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado del acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado del acceso');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ejecuci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ejecuci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ejecuci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ejecuci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ejecuci�n');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'E',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);
  	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Posibilidad de ampliaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Posibilidad de ampliaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Posibilidad de ampliaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Posibilidad de ampliaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Posibilidad de ampliaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Posibilidad de ampliaci�n');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;  				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Capilla',(select idacl FROM acl WHERE name='EIEL'),5);

		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Capilla');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ecum�nica');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ecum�nica');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ecum�nica');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ecum�nica');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ecum�nica');
		
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EC',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Monoconfesional');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Monoconfesional');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Monoconfesional');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Monoconfesional');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Monoconfesional');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe capilla');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe capilla');

			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Existencia de crematorio',(select idacl FROM acl WHERE name='EIEL'),5);

		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de crematorio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de crematorio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de crematorio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de crematorio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de crematorio');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;  				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Dep�sito de cad�veres',(select idacl FROM acl WHERE name='EIEL'),5);

		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Dep�sito de cad�veres');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Dep�sito de cad�veres');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Dep�sito de cad�veres');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Dep�sito de cad�veres');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Dep�sito de cad�veres');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
		  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		  					  				  				
 ---- 				
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_nucleo_aband');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad N�cleo Abandonado',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
  				--CA	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CH
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Confederaciones Hidrogr�ficas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CH',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Organismos P�blicos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privados');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Agua en N�cleo Abandonado',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Servicio de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Servicio de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Servicio de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Servicio de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Servicio de agua');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Distribuci�n domiciliaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Distribuci�n domiciliaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Distribuci�n domiciliaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Distribuci�n domiciliaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Distribuci�n domiciliaria');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fuente P�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fuente P�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fuente P�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fuente P�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fuente P�blica');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FP',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No dispone');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No dispone');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No dispone');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No dispone');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No dispone');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pozos individuales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pozos individuales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pozos individuales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pozos individuales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pozos individuales');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PZ',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Servicio de electricidad',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Servicio de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Servicio de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Servicio de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Servicio de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Servicio de electricidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sw_inf_tur',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sede Web municipal con informaci�n tur�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sede Web municipal con informaci�n tur�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sede Web municipal con informaci�n tur�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sede Web municipal con informaci�n tur�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sede Web municipal con informaci�n tur�stica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sw_inf_grl',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sede Web municipal con informaci�n general del n�cleo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sede Web municipal con informaci�n general del n�cleo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sede Web municipal con informaci�n general del n�cleo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sede Web municipal con informaci�n general del n�cleo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sede Web municipal con informaci�n general del n�cleo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sw_gb_elec',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sede Web con utilidades de gobierno electr�nico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sede Web con utilidades de gobierno electr�nico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sede Web con utilidades de gobierno electr�nico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sede Web con utilidades de gobierno electr�nico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sede Web con utilidades de gobierno electr�nico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Ordenanza Soterramiento',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ordenanza sobre soterramiento del cableado de redes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ordenanza sobre soterramiento del cableado de redes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ordenanza sobre soterramiento del cableado de redes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ordenanza sobre soterramiento del cableado de redes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ordenanza sobre soterramiento del cableado de redes');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_En Eolica',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta de producci�n de energ�a e�lica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta de producci�n de energ�a e�lica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta de producci�n de energ�a e�lica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta de producci�n de energ�a e�lica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta de producci�n de energ�a e�lica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_En Mareo',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta mareomotriz');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta mareomotriz');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta mareomotriz');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta mareomotriz');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta mareomotriz');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_En Solar',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta de producci�n de energ�a solar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta de producci�n de energ�a solar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta de producci�n de energ�a solar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta de producci�n de energ�a solar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta de producci�n de energ�a solar');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_En Otras',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras energ�as alternativas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras energ�as alternativas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras energ�as alternativas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras energ�as alternativas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras energ�as alternativas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  		
  		  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Posibilidad de rehabilitaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Posibilidad de rehabilitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Posibilidad de rehabilitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Posibilidad de rehabilitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Posibilidad de rehabilitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Posibilidad de rehabilitaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

-- Inserta dominio padre

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso a N�cleo Abandonado',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras v�as asfaltadas para usi de veh�culos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras v�as asfaltadas para usi de veh�culos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras v�as asfaltadas para usi de veh�culos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras v�as asfaltadas para usi de veh�culos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras v�as asfaltadas para usi de veh�culos');
						
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Caminos no asfaltados susceptibles para el uso de veh�culos autom�viles');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Caminos no asfaltados susceptibles para el uso de veh�culos autom�viles');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Caminos no asfaltados susceptibles para el uso de veh�culos autom�viles');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Caminos no asfaltados susceptibles para el uso de veh�culos autom�viles');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Caminos no asfaltados susceptibles para el uso de veh�culos autom�viles');
	
		
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Incomunicado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Incomunicado');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Red General de Carreteras(comprende las carreteras del Estado de las Comunidades Aut�nomas y Provinciales)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Red General de Carreteras(comprende las carreteras del Estado de las Comunidades Aut�nomas y Provinciales)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Red General de Carreteras(comprende las carreteras del Estado de las Comunidades Aut�nomas y Provinciales)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Red General de Carreteras(comprende las carreteras del Estado de las Comunidades Aut�nomas y Provinciales)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Red General de Carreteras(comprende las carreteras del Estado de las Comunidades Aut�nomas y Provinciales)');
	
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RG',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  		  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Caminos o veredas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Caminos o veredas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Caminos o veredas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Caminos o veredas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Caminos o veredas');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Causa de Abandono',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Causa del abandono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Causa del abandono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Causa del abandono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Causa del abandono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Causa del abandono');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Emigraci�n por causas econ�micas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Emigraci�n por causas econ�micas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Emigraci�n por causas econ�micas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Emigraci�n por causas econ�micas');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Emigraci�n por causas econ�micas');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Expropiaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Expropiaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Expropiaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Expropiaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Expropiaci�n');
		
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EX',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Incomunicaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Incomunicaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Incomunicaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Incomunicaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Incomunicaci�n');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras (se especificar� en observaciones)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras (se especificar� en observaciones)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras (se especificar� en observaciones)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras (se especificar� en observaciones)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras (se especificar� en observaciones)');
		
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
 ---- 				  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','General_equip');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad_General_equip',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--EM
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--EP
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MU
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PV
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso con silla de ruedas',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso con silla de ruedas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso con silla de ruedas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso con silla de ruedas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso con silla de ruedas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso con silla de ruedas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);		
  
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Obra ejecutada',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Obra ejecutada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Obra ejecutada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Obra ejecutada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Obra ejecutada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Obra ejecutada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);		
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor_General_equip',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipall');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
------  							 
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_vt');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

 -- Inserta dominio padre

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de vertedero',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  		---Inserta dominio hijos

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estaci�n de Transferencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estaci�n de Transferencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estaci�n de Transferencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estaci�n de Transferencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estaci�n de Transferencia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EST',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--ICA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta de tratamiento: Incineradora con aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta de tratamiento: Incineradora con aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta de tratamiento: Incineradora con aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta de tratamiento: Incineradora con aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta de tratamiento: Incineradora con aprovechamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ICA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--ISA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta de tratamiento: Incineradora sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta de tratamiento: Incineradora sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta de tratamiento: Incineradora sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta de tratamiento: Incineradora sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta de tratamiento: Incineradora sin aprovechamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ISA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OTR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros tipos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PCE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Almacenamiento: Planta de clasificaci�n de envases');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Almacenamiento: Planta de clasificaci�n de envases');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Almacenamiento: Planta de clasificaci�n de envases');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Almacenamiento: Planta de clasificaci�n de envases');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Almacenamiento: Planta de clasificaci�n de envases');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PCE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PLV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Almacenamiento: Puntos limpios, verdes o ecoparques');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Almacenamiento: Puntos limpios, verdes o ecoparques');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Almacenamiento: Puntos limpios, verdes o ecoparques');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Almacenamiento: Puntos limpios, verdes o ecoparques');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Almacenamiento: Puntos limpios, verdes o ecoparques');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PLV',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PTC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta de tratamiento: Planta de compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta de tratamiento: Planta de compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta de tratamiento: Planta de compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta de tratamiento: Planta de compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta de tratamiento: Planta de compostaje');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PTC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PTI
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planta de tratamiento: Planta de tratamiento integral');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planta de tratamiento: Planta de tratamiento integral');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planta de tratamiento: Planta de tratamiento integral');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planta de tratamiento: Planta de tratamiento integral');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planta de tratamiento: Planta de tratamiento integral');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PTI',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VCC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero controlado con explotaci�n de bi�gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero controlado con explotaci�n de bi�gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero controlado con explotaci�n de bi�gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero controlado con explotaci�n de bi�gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero controlado con explotaci�n de bi�gas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VCC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VCS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero sin aprovechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero sin aprovechamiento');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VCS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VIN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero incontrolado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero incontrolado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero incontrolado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero incontrolado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero incontrolado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VIN',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Situaci�n de la actividad de la instalaci�n',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Actividad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Actividad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Actividad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Actividad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Actividad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
		  
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Abierto');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Abierto');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Abierto');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Abierto');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Abierto');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AB',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','En uso');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','En uso');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','En uso');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','En uso');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','En uso');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sellado(no se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sellado(no se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sellado(no se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sellado(no se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sellado(no se gestiona)');
	
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SE',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sellado(se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sellado(se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sellado(se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sellado(se gestiona)');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sellado(se gestiona)');
			
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SG',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  								
 -- Inserta dominio padre

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titular del vertedero',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null); 				
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
  		
  	--CON
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CON',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MCC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada por contrata');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MCC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MCD
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada directa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MCD',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MUC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal por contrata');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MUD
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal directa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUD',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--OTS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTS',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Categoria del vertedero',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Categor�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Categor�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Categor�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Categor�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Categor�a');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);
		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 
  		---Inserta dominio hijos
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero para residuos inertes');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero para residuos inertes');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero para residuos inertes');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero para residuos inertes');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero para residuos inertes');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VIN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero mixto con residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero mixto con residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero mixto con residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero mixto con residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero mixto con residuos peligrosos');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VMN',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero para residuos no peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero para residuos no peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero para residuos no peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero para residuos no peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero para residuos no peligrosos');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VRN',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero para residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero para residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero para residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero para residuos peligrosos');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero para residuos peligrosos');

			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VRP',currval('seq_dictionary'),7,null,@idDomainNode,null);

-- Inserta dominio padre

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor del Vertedero',(select idacl FROM acl WHERE name='EIEL'),5);  
  	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null); 				
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			 		
  	--CON
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CON',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MCC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada por contrata');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CON',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MCD
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada directa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MCC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MUC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal por contrata');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--MUD
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal directa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUD',currval('seq_dictionary'),7,null,@idDomainNode,null);
	--OTS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTS',currval('seq_dictionary'),7,null,@idDomainNode,null);
				
---- 				  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_saneam_ali');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acumulaci�n Aliviadero',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Aliviadero con o sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Aliviadero con o sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Aliviadero con o sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Aliviadero con o sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Aliviadero con o sin acumulaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_olor',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Olores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Olores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Olores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Olores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Olores');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_humo',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Humos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Humos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Humos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Humos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Humos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_cont animal',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Contaminaci�n animal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Contaminaci�n animal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Contaminaci�n animal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Contaminaci�n animal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Contaminaci�n animal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_riesgo inundaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Riesgo de inundaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Riesgo de inundaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Riesgo de inundaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Riesgo de inundaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Riesgo de inundaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_filtraciones',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Filtraciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Filtraciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Filtraciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Filtraciones');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Filtraciones');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_impacto visual',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Impacto visual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Impacto visual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Impacto visual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Impacto visual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Impacto visual');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_frecuentes aver�as',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Frecuentes aver�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Frecuentes aver�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Frecuentes aver�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Frecuentes aver�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Frecuentes aver�as');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_saturaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Grado de Saturaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Grado de Saturaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Grado de Saturaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Grado de Saturaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Grado de Saturaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_inestabilidad',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Inestabilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Inestabilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Inestabilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Inestabilidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Inestabilidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_otros vertedero',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  	------				
		  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_saneam_au');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipos de saneamiento aut�nomo',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de saneamiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de saneamiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de saneamiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de saneamiento aut�nomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de saneamiento aut�nomo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
  					--FS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fosa S�ptica');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--OT	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PN	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pozo Negro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pozo Negro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pozo Negro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pozo Negro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pozo Negro');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PN',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Adecuaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Adecuaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Adecuaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Adecuaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Adecuaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Adecuaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Adecuado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Inadecuado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

-----				  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_pj');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de parque',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','�reas de la naturaleza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','�reas de la naturaleza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','�reas de la naturaleza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','�reas de la naturaleza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','�reas de la naturaleza');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AN',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Campamentos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Campamentos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Campamentos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Campamentos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Campamentos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Jardines');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Jardines');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Jardines');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Jardines');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Jardines');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'JA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Parque infantil (con uso infantil s�lo)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Parque infantil (con uso infantil s�lo)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Parque infantil (con uso infantil s�lo)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Parque infantil (con uso infantil s�lo)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Parque infantil (con uso infantil s�lo)');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PI',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Parque no urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Parque no urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Parque no urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Parque no urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Parque no urbano');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PN',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Parque urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Parque urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Parque urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Parque urbano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Parque urbano');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Refugio de pesca y de monta�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Refugio de pesca y de monta�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Refugio de pesca y de monta�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Refugio de pesca y de monta�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Refugio de pesca y de monta�a');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RF',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zonas recreativas naturales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zonas recreativas naturales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zonas recreativas naturales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zonas recreativas naturales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zonas recreativas naturales');

		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZR',currval('seq_dictionary'),7,null,@idDomainNode,null);


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_saneamiento',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de saneamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de saneamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de saneamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de saneamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de saneamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Otras',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Existencia de agua',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de agua');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de agua');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  		
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_juegos_inf',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de juegos infantiles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de juegos infantiles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de juegos infantiles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de juegos infantiles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de juegos infantiles');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_comedor',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de zona de comedor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de zona de comedor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de zona de comedor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de zona de comedor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de zona de comedor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
  				
  insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_electricidad',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de electricidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de electricidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  								  				
 ------		
-- insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_saneam_serv');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sumideros',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sumideros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sumideros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sumideros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sumideros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sumideros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				

  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SF',currval('seq_dictionary'),7,null,@idDomainNode,null);
			

  				
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_pozos_registro',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pozos de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pozos de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pozos de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pozos de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pozos de registro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			

  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SF',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_aliv_c_acum',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Aliviaderos con acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Aliviaderos con acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Aliviaderos con acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Aliviaderos con acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Aliviaderos con acumulaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	

	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_aliv_s_acum',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Aliviaderos sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Aliviaderos sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Aliviaderos sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Aliviaderos sin acumulaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Aliviaderos sin acumulaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 ------		
	  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_en');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad Ense�anza',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--CE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros p�blicos: Centros estatales transferidos o no a las Comunidades Aut�nomas y los creados por �stas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros p�blicos: Centros estatales transferidos o no a las Comunidades Aut�nomas y los creados por �stas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros p�blicos: Centros estatales transferidos o no a las Comunidades Aut�nomas y los creados por �stas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros p�blicos: Centros estatales transferidos o no a las Comunidades Aut�nomas y los creados por �stas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros p�blicos: Centros estatales transferidos o no a las Comunidades Aut�nomas y los creados por �stas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CL
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Centros p�blicos: creados y financiados por Corporaciones Locales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Centros p�blicos: creados y financiados por Corporaciones Locales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Centros p�blicos: creados y financiados por Corporaciones Locales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Centros p�blicos: creados y financiados por Corporaciones Locales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Centros p�blicos: creados y financiados por Corporaciones Locales');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Centros p�blicos o de utilidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Centros p�blicos o de utilidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Centros p�blicos o de utilidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Centros p�blicos o de utilidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Centros p�blicos o de utilidad p�blica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros privados, legalmente reconocidos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros privados, legalmente reconocidos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros privados, legalmente reconocidos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros privados, legalmente reconocidos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros privados, legalmente reconocidos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--UP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro P�blicos de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro P�blicos de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro P�blicos de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro P�blicos de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro P�blicos de Estudios Universitarios');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--UV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros Privados de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros Privados de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros Privados de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros Privados de Estudios Universitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros Privados de Estudios Universitarios');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UV',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_�mbitos de Centros de ense�anza',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','�mbito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','�mbito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','�mbito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','�mbito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','�mbito');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Asignado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Asignado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Asignado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Asignado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Asignado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'A',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comarcal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Local');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'L',currval('seq_dictionary'),7,null,@idDomainNode,null);
-----
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_ip');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad del Centro de Protecci�n Civil',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--CO	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada (det�llese en observaciones)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--XR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cruz Roja Espa�ola');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'XR',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de Centro de Protecci�n Civil',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de centro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Parque de Bomberos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Parque de Bomberos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Parque de Bomberos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Parque de Bomberos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Parque de Bomberos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de Salvamento y Socorrismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de Salvamento y Socorrismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de Salvamento y Socorrismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de Salvamento y Socorrismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de Salvamento y Socorrismo');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CS',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de Protecci�n Civil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de Protecci�n Civil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de Protecci�n Civil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de Protecci�n Civil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de Protecci�n Civil');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PC',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_�mbito territorial',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','�mbito terrirorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','�mbito terrirorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','�mbito terrirorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','�mbito terrirorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','�mbito terrirorial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comarcal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor Extincion de Incendios y Proteccion Civil',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Organismos P�blicos (det�llese en observaciones)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OP',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);


			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada (det�llese en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada (det�llese en observaciones)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cruz Roja Espa�ola');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cruz Roja Espa�ola');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'XR',currval('seq_dictionary'),7,null,@idDomainNode,null);

------	
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_mt');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Otros Mataderos',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_tunel',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tunel de conservaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tunel de conservaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tunel de conservaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tunel de conservaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tunel de conservaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_porcino',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Porcino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Porcino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Porcino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Porcino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Porcino');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_bovino',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bovino');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
				
  				
  				insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_ovino',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ovino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ovino');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Clase de Matadero',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Clase');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Clase');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Clase');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Clase');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Clase');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comarcal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comarcal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincia/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincia/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincia/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincia/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincia/Insular');
				
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);						
 ------					
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_rb');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Calidad del Servicio_Recogida de Basuras',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad del servicio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Adecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Adecuado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Inadecuado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor Recogida de Basuras',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CON',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada por contrata');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MCC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada directa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MCD',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal por contrata');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal por contrata');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal directa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal directa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUD',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTS',currval('seq_dictionary'),7,null,@idDomainNode,null);
-------
								
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','General');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_tipo_red_interior',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de red interior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de red interior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de red interior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de red interior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de red interior');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	
  				--MX
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mixta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mixta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mixta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mixta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mixta');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MX',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PL
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pluvial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pluvial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pluvial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pluvial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pluvial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PL',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--RE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Residual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Residual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Residual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Residual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Residual');	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
		
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Sistema de impulsi�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sistema de transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sistema de transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sistema de transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sistema de transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sistema de transporte');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tramos por Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tramos por Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tramos por Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tramos por Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tramos por Gravedad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GR',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Conducciones por impulsi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Conducciones por impulsi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Conducciones por impulsi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Conducciones por impulsi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Conducciones por impulsi�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IM',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_precision_dig',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Precision digitalizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Precision digitalizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Precision digitalizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Precision digitalizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Precision digitalizaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Punto aproximado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Punto aproximado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Punto aproximado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Punto aproximado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Punto aproximado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AP',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Desconocido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Desconocido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Desconocido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Desconocido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Desconocido');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DC',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','GPS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','GPS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','GPS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','GPS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','GPS');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GP',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Digitalizado sobre ortofoto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Digitalizado sobre ortofoto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Digitalizado sobre ortofoto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Digitalizado sobre ortofoto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Digitalizado sobre ortofoto');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Proyecto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Proyecto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Proyecto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Proyecto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Proyecto');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PY',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Escaneado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Escaneado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Escaneado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Escaneado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Escaneado');
	
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SC',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Calidad del servicio',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad del servicio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ejecuci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'E',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Estado de conservaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ejecuci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'E',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_diametro_abast',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Di�metro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','16');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','16');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','16');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','16');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','16');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'16',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','20');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','20');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','20');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','20');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','20');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'20',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','25');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','25');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','25');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','25');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','25');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'16',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','32');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','32');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','32');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','32');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','32');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'32',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','40');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','40');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','40');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','40');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','40');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'40',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','50');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','50');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','50');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','50');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','50');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'16',currval('seq_dictionary'),7,null,@idDomainNode,null);
  						
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','63');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','63');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','63');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','63');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','63');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'63',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','75');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','75');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','75');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','75');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','75');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'75',currval('seq_dictionary'),7,null,@idDomainNode,null);
				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','90');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','90');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','90');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','90');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','90');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'90',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','110');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','110');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','110');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','110');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','110');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'110',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','125');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'125',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','140');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','140');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','140');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','140');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','140');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'140',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','160');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','160');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','160');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','160');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','160');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'160',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','180');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','180');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','180');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','180');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','180');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'180',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','200');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'200',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','250');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'250',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','315');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','315');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','315');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','315');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','315');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'315',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','400');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'400',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','450');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'450',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','500');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'500',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','630');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','630');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','630');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','630');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','630');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'630',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','710');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','710');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','710');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','710');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','710');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'710',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','800');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'800',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','900');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'900',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  				
  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1000');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1000',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1200');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1200',currval('seq_dictionary'),7,null,@idDomainNode,null);
  		
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_diametro_sanea',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Di�metro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Di�metro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','100');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','100');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','100');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','100');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','100');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'100',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','125');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','125');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'125',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','150');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','150');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','150');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','150');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','150');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'150',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','200');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'200',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','250');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','250');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'250',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','300');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','300');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','300');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','300');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','300');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'300',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','350');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','350');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','350');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','350');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','350');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'350',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','400');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'400',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','450');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','450');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'450',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','500');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','500');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'500',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','600');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'600',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','700');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','700');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','700');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','700');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','700');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'700',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','800');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'800',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','900');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','900');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'900',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1000');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1000');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1000',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1200');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1200');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1200',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1400');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1400');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1400',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1600');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1600');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1600',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','1800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','1800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','1800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','1800');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','1800');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1800',currval('seq_dictionary'),7,null,@idDomainNode,null);
  		
  	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Estado de revisi�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado de revisi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado de revisi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado de revisi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado de revisi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado de revisi�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sin actualizar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sin actualizar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sin actualizar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sin actualizar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sin actualizar');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'0',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Actualizado en campo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Actualizado en campo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Actualizado en campo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Actualizado en campo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Actualizado en campo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'1',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Actualizado y revisado, pendiente cargar en servidor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Actualizado y revisado, pendiente cargar en servidor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Actualizado y revisado, pendiente cargar en servidor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Actualizado y revisado, pendiente cargar en servidor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Actualizado y revisado, pendiente cargar en servidor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'2',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Actualizado definitivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Actualizado definitivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Actualizado definitivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Actualizado definitivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Actualizado definitivo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'3',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Informaci�n antigua 2007');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Informaci�n antigua 2007');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Informaci�n antigua 2007');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Informaci�n antigua 2007');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Informaci�n antigua 2007');
	
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'4',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
  				
  				
  				
  				
  				
  				
  				
  				
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_material',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Material');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Material');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Material');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Material');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Material');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fibrocemento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fibrocemento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fibrocemento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fibrocemento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fibrocemento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FC',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fundici�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fundici�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fundici�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fundici�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fundici�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FU',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hormig�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','PVC');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','PVC');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','PVC');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','PVC');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','PVC');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PC',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Polietileno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Polietileno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Polietileno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Polietileno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Polietileno');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PE',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Poliester reforzado con fibra de vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Poliester reforzado con fibra de vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Poliester reforzado con fibra de vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Poliester reforzado con fibra de vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Poliester reforzado con fibra de vidrio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);
  						
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plomo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plomo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PL',currval('seq_dictionary'),7,null,@idDomainNode,null);
-------
			
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_abast_tp');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Ubicaci�n del tratamiento de potabilizaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ubicaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ubicaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ubicaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ubicaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ubicaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Captaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CD
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Conducci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Conducci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Conducci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Conducci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Conducci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CD',currval('seq_dictionary'),7,null,@idDomainNode,null);

  		--DE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Dep�sito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Dep�sito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Dep�sito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Dep�sito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Dep�sito');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--RD
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Red de distribuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Red de distribuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Red de distribuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Red de distribuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Red de distribuci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RD',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Automatizaci�n del equipamiento',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			  					

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Autom�tico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Autom�tico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Autom�tico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Autom�tico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Autom�tico');
	
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Manual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Manual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Manual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Manual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Manual');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_s_desinf',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','S�lo desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','S�lo desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','S�lo desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','S�lo desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','S�lo desinfecci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			  				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Periodicidad',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Periodicidad de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Periodicidad de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Periodicidad de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Periodicidad de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Periodicidad de control');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			  				
  						insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Alterno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Alterno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Alterno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Alterno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Alterno');
	
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AL',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Diario');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DI',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mensual');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ME',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Quincenal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'QU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Semanal');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SE',currval('seq_dictionary'),7,null,@idDomainNode,null);			
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Control de calidad: Organismo',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Organismo de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Organismo de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Organismo de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Organismo de control');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Organismo de control');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
  					insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);


			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial');
  				
  		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_categoria_a1',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Categor�a A1');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Categor�a A1');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Categor�a A1');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Categor�a A1');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Categor�a A1');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_categoria_a2',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Categor�a A2');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Categor�a A2');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Categor�a A2');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Categor�a A2');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Categor�a A2');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_categoria_a3',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Categor�a A3');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Categor�a A3');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Categor�a A3');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Categor�a A3');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Categor�a A3');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_desaladora',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Desaladora');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Desaladora');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Desaladora');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Desaladora');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Desaladora');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  						
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_M�todo de desinfecci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','M�todo de desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','M�todo de desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','M�todo de desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','M�todo de desinfecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','M�todo de desinfecci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cloro Gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cloro Gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cloro Gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cloro Gas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cloro Gas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CG',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cloraminas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cloraminas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cloraminas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cloraminas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cloraminas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Di�xido de cloro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Di�xido de cloro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Di�xido de cloro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Di�xido de cloro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Di�xido de cloro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hipoclorito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hipoclorito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hipoclorito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hipoclorito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hipoclorito');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HP',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Microfiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Microfiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Microfiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Microfiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Microfiltraci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nanofiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nanofiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nanofiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nanofiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nanofiltraci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Osmosis inversa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Osmosis inversa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Osmosis inversa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Osmosis inversa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Osmosis inversa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ozonizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ozonizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ozonizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ozonizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ozonizaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OZ',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ultrafiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ultrafiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ultrafiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ultrafiltraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ultrafiltraci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ultravioleta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ultravioleta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ultravioleta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ultravioleta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ultravioleta');
	
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  			values(nextval('seq_domainnodes'),currval('seq_domains'),'UL',currval('seq_dictionary'),7,null,@idDomainNode,null);	
  				
 ------	
			
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_abast_ar');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Clave Abast AR',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Clave');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Boca de Riego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Boca de Riego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Boca de Riego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Boca de Riego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Boca de Riego');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hidrante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hidrante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hidrante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hidrante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hidrante');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Purgador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Purgador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Purgador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Purgador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Purgador');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','V�lvula');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','V�lvula');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','V�lvula');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','V�lvula');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','V�lvula');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ventosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ventosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ventosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ventosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ventosa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
-----	
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_saneam_pr');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Clave Saneam PR',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Clave');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Clave');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','C�mara de Limpia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','C�mara de Limpia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','C�mara de Limpia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','C�mara de Limpia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','C�mara de Limpia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pozo de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pozo de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pozo de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pozo de registro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pozo de registro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SP',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sumidero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sumidero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sumidero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sumidero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sumidero');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SU',currval('seq_dictionary'),7,null,@idDomainNode,null);
-----	

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_otros_serv_munic');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_tv_dig_cable',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Televisi�n digital por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Televisi�n digital por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Televisi�n digital por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Televisi�n digital por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Televisi�n digital por cable');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_cob_serv_tlf_m',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cobertura del servicio de telefon�a m�vil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cobertura del servicio de telefon�a m�vil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cobertura del servicio de telefon�a m�vil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cobertura del servicio de telefon�a m�vil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cobertura del servicio de telefon�a m�vil');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			
-----	

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_abast_ca');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de uso CA',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de uso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de uso)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de uso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de uso)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de uso');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--UE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Uso extraordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Uso extraordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Uso extraordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Uso extraordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Uso extraordinario');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--UO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Uso ordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Uso ordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Uso ordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Uso ordinario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Uso ordinario');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UO',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de Captaci�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;  		
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Aljibes de lluvia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Aljibes de lluvia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Aljibes de lluvia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Aljibes de lluvia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Aljibes de lluvia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Agua de mar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Agua de mar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Agua de mar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Agua de mar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Agua de mar');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AM',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Agua salobre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Agua salobre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Agua salobre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Agua salobre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Agua salobre');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Canal o similar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Canal o similar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Canal o similar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Canal o similar');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Canal o similar');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Embalse');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Embalse');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Embalse');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Embalse');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Embalse');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EB',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Galer�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Galer�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Galer�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Galer�a');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Galer�a');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Manantial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Manantial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Manantial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Manantial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Manantial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pozo entubado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pozo entubado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pozo entubado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pozo entubado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pozo entubado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pozo excavado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pozo excavado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pozo excavado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pozo excavado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pozo excavado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PX',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','R�o');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','R�o');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','R�o');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','R�o');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','R�o');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sondeo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sondeo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sondeo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sondeo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sondeo');		
  				
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Proteccion CA',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Protecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Protecci�n)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Protecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Protecci�n)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Protecci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;					
  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);
	

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Sist. de depuraci�n, Procesos complementarios',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Procesos Complementarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Procesos Complementarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Procesos Complementarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Procesos Complementarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Procesos Complementarios');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cogeneraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cogeneraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cogeneraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cogeneraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cogeneraci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CG',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Desodorizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Desodorizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Desodorizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Desodorizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Desodorizaci�n');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DS',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
			
  		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
			
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Contador Abast',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Contador');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
----
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_abast_de');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Ubicacion Deposito',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de dep�sito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de dep�sito)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de dep�sito');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de dep�sito)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de dep�sito');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;					
  				--EL
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Elevado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Elevado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Elevado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Elevado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Elevado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--EN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Enterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Enterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Enterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Enterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Enterrado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--ES	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','En superficie');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','En superficie');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','En superficie');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','En superficie');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','En superficie');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ES',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--SE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Semienterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Semienterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Semienterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Semienterrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Semienterrado');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SE',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Proteccion DE',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Protecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Protecci�n)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Protecci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Protecci�n)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Protecci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				
  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);
	

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suficiente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suficiente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	 				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Contador DE',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Contador');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ambos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ambos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ambos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ambos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ambos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AM',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Entrada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Entrada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Entrada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Entrada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Entrada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EN',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
  					
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Salida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Salida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Salida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Salida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Salida');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
-------	
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_inf_ttmm');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso RDSI',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso a internet a trav�s de RDSI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso a internet a trav�s de RDSI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso a internet a trav�s de RDSI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso a internet a trav�s de RDSI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso a internet a trav�s de RDSI');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
  	  
  	  		
  	 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso XDSL',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso a internet a trav�s de xDSL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso a internet a trav�s de xDSL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso a internet a trav�s de xDSL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso a internet a trav�s de xDSL');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso a internet a trav�s de xDSL');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  	  insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso Inal�mbrico',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso a internet in�lambrico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso a internet in�lambrico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso a internet in�lambrico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso a internet in�lambrico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso a internet in�lambrico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  	 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso tv_cable',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso a internet asociado a televisi�n por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso a internet asociado a televisi�n por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso a internet asociado a televisi�n por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso a internet asociado a televisi�n por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso a internet asociado a televisi�n por cable');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  	 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso red electrica',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso a internet asociado a la red el�ctrica dom�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso a internet asociado a la red el�ctrica dom�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso a internet asociado a la red el�ctrica dom�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso a internet asociado a la red el�ctrica dom�stica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso a internet asociado a la red el�ctrica dom�stica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  	 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso Sat�lite',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Acceso a internet v�a sat�lite');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Acceso a internet v�a sat�lite');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Acceso a internet v�a sat�lite');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Acceso a internet v�a sat�lite');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Acceso a internet v�a sat�lite');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
  	 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Acceso P�blico',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de centros p�blicos de acceso a internet');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de centros p�blicos de acceso a internet');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de centros p�blicos de acceso a internet');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de centros p�blicos de acceso a internet');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de centros p�blicos de acceso a internet');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  	  		values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
 
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Cobertura del servicio TV por antena',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad de se�al de la TV por antena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad de se�al de la TV por antena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad de se�al de la TV por antena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad de se�al de la TV por antena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad de se�al de la TV por antena');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--C
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Carece');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--M
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--R
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Cobertura del servicio TV por cable',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad de se�al de la TV por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad de se�al de la TV por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad de se�al de la TV por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad de se�al de la TV por cable');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad de se�al de la TV por cable');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--C
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Carece');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--M
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--R
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Calidad de cobertura en telefon�a con sistema GSM',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad de cobertura en telefon�a con sistema GSM');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad de cobertura en telefon�a con sistema GSM');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad de cobertura en telefon�a con sistema GSM');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad cobertura en telefon�a con sistema GSM');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad cobertura en telefon�a con sistema GSM');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--C
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Carece');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--M
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--R
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);
				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Calidad de cobertura en telefon�a con sistema UMTS',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad de cobertura en telefon�a con sistema UMTS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad de cobertura en telefon�a con sistema UMTS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad de cobertura en telefon�a con sistema UMTS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad cobertura en telefon�a con sistema UMTS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad cobertura en telefon�a con sistema UMTS');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--C
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Carece');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--M
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--R
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Calidad de cobertura en telefon�a con sistema GPRS',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad de cobertura en telefon�a con sistema GPRS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad de cobertura en telefon�a con sistema GPRS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad de cobertura en telefon�a con sistema GPRS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad cobertura en telefon�a con sistema GPRS');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad cobertura en telefon�a con sistema GPRS');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--B
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--C
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Carece');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--M
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--R
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);
				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Existencia de oficina de Correos',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de oficina de correos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de oficina de correos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de oficina de correos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de oficina de correos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de oficina de correos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Oficina de carter�a para distribuci�n de correo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Oficina de carter�a para distribuci�n de correo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Oficina de carter�a para distribuci�n de correo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Oficina de carter�a para distribuci�n de correo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Oficina de carter�a para distribuci�n de correo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DI',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No hay oficina');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No hay oficina');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No hay oficina');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No hay oficina');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No hay oficina');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
    insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Oficina de correos con prestaci�n de todos los servicios habituales (env�o y recepci�n de carter�a y paqueter�a, venta de sellos, burofax, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Oficina de correos con prestaci�n de todos los servicios habituales (env�o y recepci�n de carter�a y paqueter�a, venta de sellos, burofax, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Oficina de correos con prestaci�n de todos los servicios habituales (env�o y recepci�n de carter�a y paqueter�a, venta de sellos, burofax, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Oficina de correos con prestaci�n de todos los servicios habituales (env�o y recepci�n de carter�a y paqueter�a, venta de sellos, burofax, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Oficina de correos con prestaci�n de todos los servicios habituales (env�o y recepci�n de carter�a y paqueter�a, venta de sellos, burofax, etc.)');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
-------	
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_tramos_carreteras');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

  	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_muy_sinuoso',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Muy Sinuoso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Muy Sinuoso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Muy Sinuoso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Muy Sinuoso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Muy Sinuoso');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_pte_excesiva',(select idacl FROM acl WHERE name='EIEL'),5);
  
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pendiente excesiva');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pendiente excesiva');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pendiente excesiva');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pendiente excesiva');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pendiente excesiva');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

  	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_fre_estrech',(select idacl FROM acl WHERE name='EIEL'),5);
  
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Frecuente estrechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Frecuente estrechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Frecuente estrechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Frecuente estrechamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Frecuente estrechamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Se�aliza',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Se�alizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Se�alizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Se�alizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Se�alizaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Se�alizaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ambas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ambas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ambas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ambas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ambas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'A',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Horizontal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Horizontal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Horizontal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Horizontal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Horizontal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'H',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ninguna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ninguna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ninguna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ninguna');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ninguna');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'N',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertical');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertical');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertical');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertical');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertical');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'V',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_dimensiona',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Dimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Dimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Dimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Dimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Dimensionamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bien dimensionada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bien dimensionada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bien dimensionada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bien dimensionada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bien dimensionada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BD',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mal dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mal dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mal dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mal dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mal dimensionada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MD',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
   		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular dimensionada');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular dimensionada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RD',currval('seq_dictionary'),7,null,@idDomainNode,null);	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Firme Tramos C',(select idacl FROM acl WHERE name='EIEL'),5);

  insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Material del firme');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Adoqu�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hormig�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HR',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mezcla Bituminosa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Macad�m');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Riego Asf�ltico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Riego Asf�ltico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Riego Asf�ltico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Riego Asf�ltico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Riego Asf�ltico');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tierra');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zahorra estabilizada');
	
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZE',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor Tramos C',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ES',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
   		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);	

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sin Conservaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sin Conservaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sin Conservaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sin Conservaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sin Conservaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);	
  	
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);	

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Insuficiente');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Insuficiente');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);	
  				
-------	
			
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_redviaria_tu');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo Red Viaria',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de viario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de viario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de viario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de viario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de viario');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calles');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plazas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plazas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plazas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plazas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plazas');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PZ',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros viarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros viarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros viarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros viarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros viarios');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Traves�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Traves�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Traves�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Traves�as');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Traves�as');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TR',currval('seq_dictionary'),7,null,@idDomainNode,null);


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Estado Tramos C',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
 SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes; 				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ejecuci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ejecuci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ejecuci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ejecuci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ejecuci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'E',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No pavimentado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No pavimentado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No pavimentado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No pavimentado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No pavimentado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'N',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Firme Red Viaria',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Material del firme');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Material del firme');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;  				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Adoqu�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Adoqu�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hormig�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hormig�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HR',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mezcla Bituminosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mezcla Bituminosa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Macad�m');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Macad�m');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MC',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Riego As�atico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Riego As�atico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Riego As�atico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Riego As�atico');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Riego As�atico');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tierra');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tierra');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zahorra estabilizada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zahorra estabilizada');
	
  	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZE',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
 ------- 				
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_planeam_urban');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Figuras de Planeamiento',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de figura de planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de figura de planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de figura de planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de figura de planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de figura de planeamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--DC	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Delimitaci�n del Suelo Urbano con Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Delimitaci�n del Suelo Urbano con Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Delimitaci�n del Suelo Urbano con Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Delimitaci�n del Suelo Urbano con Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Delimitaci�n del Suelo Urbano con Ordenanza');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'D.C',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--DS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Delimitaci�n del Suelo Urbano sin Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Delimitaci�n del Suelo Urbano sin Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Delimitaci�n del Suelo Urbano sin Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Delimitaci�n del Suelo Urbano sin Ordenanza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Delimitaci�n del Suelo Urbano sin Ordenanza');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'D.S',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--NM	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Normas Subsidiarias de planeamiento de �mbito municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Normas Subsidiarias de planeamiento de �mbito municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Normas Subsidiarias de planeamiento de �mbito municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Normas Subsidiarias de planeamiento de �mbito municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Normas Subsidiarias de planeamiento de �mbito municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'N.M',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--NP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Normas Subsidiarias de planeamiento de �mbito provincial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Normas Subsidiarias de planeamiento de �mbito provincial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Normas Subsidiarias de planeamiento de �mbito provincial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Normas Subsidiarias de planeamiento de �mbito provincial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Normas Subsidiarias de planeamiento de �mbito provincial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'N.P',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Normas Subsidiarias de planeamiento de Planes Especiales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Normas Subsidiarias de planeamiento de Planes Especiales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Normas Subsidiarias de planeamiento de Planes Especiales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Normas Subsidiarias de planeamiento de Planes Especiales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Normas Subsidiarias de planeamiento de Planes Especiales');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'P.E',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PG
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plan General de Ordenaci�n Urbana');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plan General de Ordenaci�n Urbana');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plan General de Ordenaci�n Urbana');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plan General de Ordenaci�n Urbana');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plan General de Ordenaci�n Urbana');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'P.G',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plan Supramunicipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plan Supramunicipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plan Supramunicipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plan Supramunicipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plan Supramunicipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'P.S',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--SP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sin planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sin planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sin planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sin planeamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sin planeamiento');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SP',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Estado de tramitaci�n de la Figura de Planeamiento',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado de tramitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado de tramitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado de tramitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado de tramitaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado de tramitaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;				
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Con aprobaci�n definitiva');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Con aprobaci�n definitiva');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Con aprobaci�n definitiva');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Con aprobaci�n definitiva');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Con aprobaci�n definitiva');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Con aprobaci�n inicial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Con aprobaci�n inicial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Con aprobaci�n inicial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Con aprobaci�n inicial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Con aprobaci�n inicial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AI',currval('seq_dictionary'),7,null,@idDomainNode,null);
  			 				
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Con aprobaci�n provisional');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Con aprobaci�n provisional');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Con aprobaci�n provisional');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Con aprobaci�n provisional');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Con aprobaci�n provisional');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AP',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','En elaboraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','En elaboraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','En elaboraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','En elaboraci�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','En elaboraci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EL',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','En adaptaci�n, modificaci�n o revisi�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','En adaptaci�n, modificaci�n o revisi�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','En adaptaci�n, modificaci�n o revisi�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','En adaptaci�n, modificaci�n o revisi�n');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','En adaptaci�n, modificaci�n o revisi�n');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ER',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
----
			
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_sa');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_uci',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Existencia de UCI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Existencia de UCI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Existencia de UCI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Existencia de UCI');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Existencia de UCI');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
			

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad Centro Sanitario',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
			
  				--CAU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CAU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	--DIP 
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Diputaciones, Consejos o Cabildos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DIP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--FAS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ministerio de Defensa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FAS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MAT	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mutua de Accidentes de Trabajo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MAT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MUN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MUN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OAC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros organismos Administr. Central');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros organismos Administr. Central');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros organismos Administr. Central');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros organismos Administr. Central');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros organismos Administr. Central');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OAC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OEP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otra Entidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otra Entidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otra Entidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otra Entidad p�blica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otra Entidad p�blica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OEP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OTR	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	---PCR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cruz Roja');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PCR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PIG
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Iglesia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PIG',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PNB
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros privado no ben�fico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PNB',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PRB
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros privado ben�fico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PRB',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--TSS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Seguridad Social (Tesorer�a General)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Seguridad Social (Tesorer�a General)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Seguridad Social (Tesorer�a General)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Seguridad Social (Tesorer�a General)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Seguridad Social (Tesorer�a General)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TSS',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo Centro Sanitario',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de centro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ambulatorio, Centro de especialidades o policl�nicas sin internamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ambulatorio, Centro de especialidades o policl�nicas sin internamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ambulatorio, Centro de especialidades o policl�nicas sin internamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ambulatorio, Centro de especialidades o policl�nicas sin internamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ambulatorio, Centro de especialidades o policl�nicas sin internamiento');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AMB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de Salud');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CDS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consultoria Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consultoria Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consultoria Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consultoria Local');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consultoria Local');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CLO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros de Urgencia y Casas de Socorro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros de Urgencia y Casas de Socorro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros de Urgencia y Casas de Socorro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros de Urgencia y Casas de Socorro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros de Urgencia y Casas de Socorro');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CUR',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hospital General');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hospital General');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hospital General');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hospital General');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hospital General');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HGS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hospital maternal e infantil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hospital maternal e infantil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hospital maternal e infantil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hospital maternal e infantil');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hospital maternal e infantil');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HIN',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hospital geri�trico y larga estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hospital geri�trico y larga estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hospital geri�trico y larga estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hospital geri�trico y larga estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hospital geri�trico y larga estancia');
	
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HLE',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hospital otras especialidades');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hospital otras especialidades');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hospital otras especialidades');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hospital otras especialidades');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hospital otras especialidades');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HOE',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hospital psiqui�trico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hospital psiqui�trico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hospital psiqui�trico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hospital psiqui�trico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hospital psiqui�trico');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HPS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hospital quir�rgico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hospital quir�rgico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hospital quir�rgico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hospital quir�rgico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hospital quir�rgico');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HQU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Centros sanitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Centros sanitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Centros sanitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Centros sanitarios');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Centros sanitarios');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor Centro Sanitario',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma son transferencias');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma son transferencias');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma son transferencias');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma son transferencias');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma son transferencias');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CAS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Diputaciones, Consejos o Cabildos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Diputaciones, Consejos o Cabildos');
	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DIP',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ministerio de Defensa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ministerio de Defensa');
	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FAS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','INSALUD');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','INSALUD');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','INSALUD');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','INSALUD');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','INSALUD');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'INS',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mutua de Accidentes de Trabajo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mutua de Accidentes de Trabajo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MAT',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras Entidades p�blicas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras Entidades p�blicas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras Entidades p�blicas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras Entidades p�blicas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras Entidades p�blicas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OEP',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privado ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privado ben�fico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OPB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTR',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cruz Roja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cruz Roja');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PCR',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Iglesia');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PIG',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privado no ben�fico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privado no ben�fico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PNB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Servicio Auton�mico de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Servicio Auton�mico de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Servicio Auton�mico de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Servicio Auton�mico de Salud');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Servicio Auton�mico de Salud');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SAS',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
-----	
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','General_absto/sto');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
  				--CO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--EM
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--EP
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MU
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PV
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gesti�n',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gestor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunada');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
			
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);

-----	
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t2_saneam_ed');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));



insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_EDAR problemas existentes',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Problemas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Problemas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Problemas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Problemas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Problemas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Abandonada o sin uso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Abandonada o sin uso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Abandonada o sin uso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Abandonada o sin uso');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Abandonada o sin uso');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AB',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Costes de explotaci�n elevados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Costes de explotaci�n elevados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Costes de explotaci�n elevados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Costes de explotaci�n elevados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Costes de explotaci�n elevados');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CE',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Explotaci�n incorrecta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Explotaci�n incorrecta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Explotaci�n incorrecta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Explotaci�n incorrecta');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Explotaci�n incorrecta');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Falta de elementos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Falta de elementos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Falta de elementos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Falta de elementos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Falta de elementos');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FE',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Falta de mantenimiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Falta de mantenimiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Falta de mantenimiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Falta de mantenimiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Falta de mantenimiento');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FM',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Infradimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Infradimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Infradimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Infradimensionamiento');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Infradimensionamiento');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IF',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sistema inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sistema inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sistema inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sistema inadecuado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sistema inadecuado');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertidos industriales adicionales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertidos industriales adicionales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertidos industriales adicionales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertidos industriales adicionales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertidos industriales adicionales');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_EDAR Gesti�n de lodos',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gesti�n de lodos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gesti�n de lodos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gesti�n de lodos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gesti�n de lodos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gesti�n de lodos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);

-----	

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_en_nivel');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_niveles_centros_ensenianza',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nivel de ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nivel de ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nivel de ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nivel de ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nivel de ense�anza');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bachillerato');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bachillerato');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bachillerato');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bachillerato');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bachillerato');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BAC',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Secundaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Secundaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Secundaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Secundaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Secundaria');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ESO',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Educaci�n Especial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Educaci�n Especial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Educaci�n Especial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Educaci�n Especial');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Educaci�n Especial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ESP',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Formaci�n Profesional de grado medio y/o antigua FP de primer grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Formaci�n Profesional de grado medio y/o antigua FP de primer grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Formaci�n Profesional de grado medio y/o antigua FP de primer grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Formaci�n Profesional de grado medio y/o antigua FP de primer grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Formaci�n Profesional de grado medio y/o antigua FP de primer grado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FP1',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Formaci�n Profesional de grado superior y/o  FP de segundo grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Formaci�n Profesional de grado superior y/o  FP de segundo grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Formaci�n Profesional de grado superior y/o  FP de segundo grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Formaci�n Profesional de grado superior y/o  FP de segundo grado');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Formaci�n Profesional de grado superior y/o  FP de segundo grado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FP2',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Educaci�n Infantil');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Educaci�n Infantil');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Educaci�n Infantil');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Educaci�n Infantil');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Educaci�n Infantil');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'INF',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras ense�anzas no universitarias(idiomas,m�sica,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras ense�anzas no universitarias(idiomas,m�sica,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras ense�anzas no universitarias(idiomas,m�sica,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras ense�anzas no universitarias(idiomas,m�sica,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras ense�anzas no universitarias(idiomas,m�sica,etc.)');
	
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OTR',currval('seq_dictionary'),7,null,@idDomainNode,null);	
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Primaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Primaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Primaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Primaria');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Primaria');
	
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PRI',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estudios Universitarios de 1� Ciclo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estudios Universitarios de 1� Ciclo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estudios Universitarios de 1� Ciclo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estudios Universitarios de 1� Ciclo');
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estudios Universitarios de 1� Ciclo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UN1',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estudios Universitarios de 2� Ciclo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estudios Universitarios de 2� Ciclo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estudios Universitarios de 2� Ciclo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estudios Universitarios de 2� Ciclo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estudios Universitarios de 2� Ciclo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UN2',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estudios Universitarios de Postgrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estudios Universitarios de Postgrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estudios Universitarios de Postgrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estudios Universitarios de Postgrado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estudios Universitarios de Postgrado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UN3',currval('seq_dictionary'),7,null,@idDomainNode,null);

----

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_abast_tp');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Otros Nivel',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 ------				
			
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_rb');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de recogida selectiva de basura',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de recogido de residuos urbanos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de recogido de residuos urbanos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de recogido de residuos urbanos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de recogido de residuos urbanos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de recogido de residuos urbanos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
		
  		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Recogida Org�nica (s�lo residuos org�nicos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Recogida Org�nica (s�lo residuos org�nicos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Recogida Org�nica (s�lo residuos org�nicos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Recogida Org�nica (s�lo residuos org�nicos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Recogida Org�nica (s�lo residuos org�nicos)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OG',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros tipos selectivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros tipos selectivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros tipos selectivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros tipos selectivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros tipos selectivos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Papel o cart�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Papel o cart�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Papel o cart�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Papel o cart�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Papel o cart�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pilas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pilas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pilas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pilas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pilas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PI',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Envases y pl�sticos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Envases y pl�sticos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Envases y pl�sticos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Envases y pl�sticos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Envases y pl�sticos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No selectiva (recogida de residuos no seleccionados)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No selectiva (recogida de residuos no seleccionados)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No selectiva (recogida de residuos no seleccionados)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No selectiva (recogida de residuos no seleccionados)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No selectiva (recogida de residuos no seleccionados)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vidrio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vidrio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VI',currval('seq_dictionary'),7,null,@idDomainNode,null);	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Periocicidad',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Periodicidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Periodicidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Periodicidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Periodicidad del servicio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Periodicidad del servicio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','D�as alternos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','D�as alternos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','D�as alternos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','D�as alternos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','D�as alternos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AL',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Diario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Diario');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DI',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mensual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mensual');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ME',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe periodicidad preestablecida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe periodicidad preestablecida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe periodicidad preestablecida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe periodicidad preestablecida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe periodicidad preestablecida');
		
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Quincenal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Quincenal');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'QU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Semanal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Semanal');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SE',currval('seq_dictionary'),7,null,@idDomainNode,null);

------
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_alum_pl');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_tipo_luminaria',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de luminaria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de luminaria');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
  				--FA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Farol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Farol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Farol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Farol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Farol');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_tipo_lampara',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de l�mpara');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de l�mpara');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de l�mpara');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de l�mpara');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de l�mpara');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  					--FL
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fluorescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fluorescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fluorescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fluorescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fluorescente');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	--HA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Halogenuros met�licos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Halogenuros met�licos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Halogenuros met�licos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Halogenuros met�licos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Halogenuros met�licos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--IN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Incandescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Incandescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Incandescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Incandescente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Incandescente');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--ME
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mercurio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mercurio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mercurio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mercurio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mercurio');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ME',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MZ
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mezcla');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mezcla');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mezcla');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mezcla');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mezcla');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MZ',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--SO
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sodio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sodio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sodio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sodio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sodio');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SO',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_tipo_apoyo',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de apoyo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de apoyo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de apoyo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de apoyo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de apoyo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
  				--PA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pared');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pared');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pared');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pared');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pared');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PA',currval('seq_dictionary'),7,null,@idDomainNode,null);


	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Suelo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Suelo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Suelo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Suelo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Suelo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sist_eficiencia_pl',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sistema de eficiencia enereg�tica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sistema de eficiencia enereg�tica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sistema de eficiencia enereg�tica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sistema de eficiencia enereg�tica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sistema de eficiencia enereg�tica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Doble nivel');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Doble nivel');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Doble nivel');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Doble nivel');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Doble nivel');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DNL',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sin sistema de eficiencia individual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sin sistema de eficiencia individual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sin sistema de eficiencia individual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sin sistema de eficiencia individual');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sin sistema de eficiencia individual');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Reactancia electr�nica con reductor de flujo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Reactancia electr�nica con reductor de flujo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Reactancia electr�nica con reductor de flujo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Reactancia electr�nica con reductor de flujo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Reactancia electr�nica con reductor de flujo');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RER',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
 insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_contador',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Contador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Contador');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--------- 				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_abast_ca');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sist_impulsion',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sistema de captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sistema de captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sistema de captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sistema de captaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sistema de captaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gravedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gravedad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GR',currval('seq_dictionary'),7,null,@idDomainNode,null);				
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Instalaci�n Forzada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Instalaci�n Forzada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Instalaci�n Forzada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Instalaci�n Forzada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Instalaci�n Forzada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IF',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
------  				
 
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_abast_rd');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_sist_trans',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sistema de Transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sistema de Transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sistema de Transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sistema de Transporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sistema de Transporte');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 ------			
  				
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_cc');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad Casa Consistorial',(select idacl FROM acl WHERE name='EIEL'),5);

insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		

  				--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null); 

	--MU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null); 

	
	--OP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros Organismos P�blicos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros Organismos P�blicos');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OP',currval('seq_dictionary'),7,null,@idDomainNode,null); 

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null); 
	
	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null); 

	--PV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null); 

	
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de Casa Consistorial',(select idacl FROM acl WHERE name='EIEL'),5);

insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de centro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Antiguas escuelas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Antiguas escuelas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Antiguas escuelas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Antiguas escuelas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Antiguas escuelas');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AE',currval('seq_dictionary'),7,null,@idDomainNode,null); 
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Casa Consistorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Casa Consistorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Casa Consistorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Casa Consistorial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Casa Consistorial');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AY',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros tipos');	
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros edificios de usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros edificios de usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros edificios de usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros edificios de usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros edificios de usos administrativos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Viviendas municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Viviendas municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Viviendas municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Viviendas municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Viviendas municipales');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VM',currval('seq_dictionary'),7,null,@idDomainNode,null);

  		
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Forma de tenencia CC',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tenencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tenencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tenencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tenencia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tenencia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Alquiler');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Alquiler');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Alquiler');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Alquiler');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Alquiler');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),'AL',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cesi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cesi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cesi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cesi�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cesi�n');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),'CE',currval('seq_dictionary'),7,null,@idDomainNode,null);

		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Propiedad Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Propiedad Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Propiedad Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Propiedad Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Propiedad Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

---------

-- insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_saneam_tcl');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Colector de Tipo interceptor',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Colector de Tipo interceptor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Colector de Tipo interceptor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Colector de Tipo interceptor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Colector de Tipo interceptor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Colector de Tipo interceptor');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 ------
  		
  
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_c_edificiosing');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de Edificio',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fuente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fuente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fuente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fuente');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fuente');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Iglesia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Iglesia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IG',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Lavadero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Lavadero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Lavadero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Lavadero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Lavadero');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LV',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','H�rreo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','H�rreo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','H�rreo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','H�rreo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','H�rreo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HR',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Panera');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Panera');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Panera');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Panera');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Panera');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
------
	

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_as');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de Centro Asistencial',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de Centro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  				
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Albergues municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Albergues municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Albergues municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Albergues municipales');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Albergues municipales');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AL',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de Asistencia Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de Asistencia Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de Asistencia Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de Asistencia Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de Asistencia Social');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de rehabilitaci�n toxic�manos con estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de rehabilitaci�n toxic�manos con estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de rehabilitaci�n toxic�manos con estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de rehabilitaci�n toxic�manos con estancia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de rehabilitaci�n toxic�manos con estancia');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de rehabilitaci�n toxic�manos abierto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de rehabilitaci�n toxic�manos abierto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de rehabilitaci�n toxic�manos abierto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de rehabilitaci�n toxic�manos abierto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de rehabilitaci�n toxic�manos abierto');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros extremos(comedores,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros extremos(comedores,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros extremos(comedores,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros extremos(comedores,etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros extremos(comedores,etc.)');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EX',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Guarder�as infantiles(no los parvularios ni docentes preescolares)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Guarder�as infantiles(no los parvularios ni docentes preescolares)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Guarder�as infantiles(no los parvularios ni docentes preescolares)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Guarder�as infantiles(no los parvularios ni docentes preescolares)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Guarder�as infantiles(no los parvularios ni docentes preescolares)');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GI',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros internos (orfelinatos, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros internos (orfelinatos, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros internos (orfelinatos, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros internos (orfelinatos, etc.)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros internos (orfelinatos, etc.)');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Residencia de ancianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Residencia de ancianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Residencia de ancianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Residencia de ancianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Residencia de ancianos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RA',currval('seq_dictionary'),7,null,@idDomainNode,null);
------

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_cu');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo Centro Cultural',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de Centro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de Centro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Archivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Archivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Archivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Archivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Archivo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AR',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Auditorio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Biblioteca');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BI',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Casino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Casino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Casino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Casino');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Panera');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Casa de Cultura');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Casa de Cultura');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Casa de Cultura');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Casa de Cultura');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Casa de Cultura');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CC',currval('seq_dictionary'),7,null,@idDomainNode,null);

		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro C�vico/Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro C�vico/Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro C�vico/Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro C�vico/Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro C�vico/Social');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hogar del pensionista');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'HP',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Kiosco de m�sica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'KI',currval('seq_dictionary'),7,null,@idDomainNode,null);

  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ludoteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ludoteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ludoteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ludoteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ludoteca');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Museo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plaza de toros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PZ',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sociedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sociedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sociedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sociedad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sociedad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Teatro/Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Teatro/Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Teatro/Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Teatro/Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Teatro/Cine');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TC',currval('seq_dictionary'),7,null,@idDomainNode,null);

---------
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_id');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo de instalaciones deportivas',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de instalaci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de instalaci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Complejos polideportivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Complejos polideportivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Complejos polideportivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Complejos polideportivos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Complejos polideportivos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  			values(nextval('seq_domainnodes'),currval('seq_domains'),'CP',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
		
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Escuela de vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Escuela de vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Escuela de vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Escuela de vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Escuela de vela');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EV',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Frontones(cubiertos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Frontones(cubiertos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Frontones(cubiertos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Frontones(cubiertos)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Frontones(cubiertos)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FC',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Frontones(sin cubrir)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Frontones(sin cubrir)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Frontones(sin cubrir)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Frontones(sin cubrir)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Frontones(sin cubrir)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FR',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gimnasio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gimnasio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gimnasio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gimnasio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gimnasio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GI',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Piscinas cubiertas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Piscinas cubiertas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Piscinas cubiertas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Piscinas cubiertas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Piscinas cubiertas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PC',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Puerto deportivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Puerto deportivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Puerto deportivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Puerto deportivo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Puerto deportivo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PD',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Piscinas al aire libre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Piscinas al aire libre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Piscinas al aire libre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Piscinas al aire libre');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Piscinas al aire libre');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PI',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pistas polideportivas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pistas polideportivas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pistas polideportivas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pistas polideportivas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pistas polideportivas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PP',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Polideportivos cubiertos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Polideportivos cubiertos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Polideportivos cubiertos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Polideportivos cubiertos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Polideportivos cubiertos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PT',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estaciones de esqu�');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estaciones de esqu�');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estaciones de esqu�');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estaciones de esqu�');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estaciones de esqu�');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SK',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Terrenos de juego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Terrenos de juego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Terrenos de juego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Terrenos de juego');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Terrenos de juego');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TJ',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	

----

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_saneam_pv');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Zona del punto de vertido',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zona de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zona de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zona de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zona de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zona de vertido');
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  			values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	
  	--ZM
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zona menos sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zona menos sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zona menos sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zona menos sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zona menos sensible');	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZM',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--ZN
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zona normal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zona normal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zona normal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zona normal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zona normal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZN',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--ZS
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zona sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zona sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zona sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zona sensible');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zona sensible');
	  
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZS',currval('seq_dictionary'),7,null,@idDomainNode,null);		

  
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo Vertido',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo de vertido');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo de vertido');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;						
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Aguas continentales o dulces');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Aguas continentales o dulces');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Aguas continentales o dulces');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Aguas continentales o dulces');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Aguas continentales o dulces');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AD',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Aguas costeras o mar�timas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Aguas costeras o mar�timas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Aguas costeras o mar�timas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Aguas costeras o mar�timas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Aguas costeras o mar�timas');
	
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AM',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--CA
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Canal o similar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Canal o similar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Canal o similar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Canal o similar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Canal o similar');
	
--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
--  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	--EM
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Embalse');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Embalse');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Embalse');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Embalse');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Embalse');
	
--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
--  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros tipos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros tipos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--RI
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','R�o');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','R�o');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','R�o');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','R�o');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','R�o');
	
--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
--  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RI',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--VA
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vaguada');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vaguada');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vaguada');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vaguada');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vaguada');
	
--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
--  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VA',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	--VM
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertido al mar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertido al mar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertido al mar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertido al mar');
--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertido al mar');
	
--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
--  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VM',currval('seq_dictionary'),7,null,@idDomainNode,null);			
------  	

--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_id_deportes');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipo Deporte',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo deporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo deporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo deporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo deporte');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo deporte');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;								
  		--AS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Actividades subacu�ticas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Actividades subacu�ticas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Actividades subacu�ticas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Actividades subacu�ticas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Actividades subacu�ticas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AS',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--AT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Atletismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Atletismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Atletismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Atletismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Atletismo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AT',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--BB
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Beisbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Beisbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Beisbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Beisbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Beisbol');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BB',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--BC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Baloncesto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Baloncesto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Baloncesto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Baloncesto');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Baloncesto');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BC',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--BM
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Balonmano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Balonmano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Balonmano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Balonmano');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Balonmano');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BM',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--BO
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bolos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bolos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bolos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bolos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bolos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BO',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--BV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bal�n volea');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bal�n volea');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bal�n volea');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bal�n volea');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bal�n volea');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BV',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--DI	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Deportes de invierno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Deportes de invierno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Deportes de invierno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Deportes de invierno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Deportes de invierno');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DI',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--EN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Esqu� n�utico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Esqu� n�utico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Esqu� n�utico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Esqu� n�utico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Esqu� n�utico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EN',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--FB
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','F�tbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','F�tbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','F�tbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','F�tbol');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','F�tbol');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FB',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--GF
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Golf');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Golf');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Golf');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Golf');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Golf');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GF',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--GI
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gimnasia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gimnasia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gimnasia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gimnasia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gimnasia');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'GI',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--JU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Judo/K�rate');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Judo/K�rate');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Judo/K�rate');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Judo/K�rate');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Judo/K�rate');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'JU',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--LU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Lucha');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Lucha');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Lucha');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Lucha');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Lucha');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LU',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--NA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nataci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nataci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nataci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nataci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nataci�n');
	
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NA',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	--PD
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','P�del');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','P�del');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','P�del');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','P�del');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','P�del');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PD',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--PE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pesca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pesca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pesca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pesca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pesca');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PE',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--PL
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pelota');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pelota');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pelota');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pelota');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pelota');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PL',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Pirag�ismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Pirag�ismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Pirag�ismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Pirag�ismo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Pirag�ismo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--PT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Patinaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Patinaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Patinaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Patinaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Patinaje');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PT',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--RE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Remo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Remo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Remo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Remo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Remo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'RE',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--TE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tenis');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tenis');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tenis');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tenis');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tenis');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TE',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--TP
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tiro al plato');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tiro al plato');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tiro al plato');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tiro al plato');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tiro al plato');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TP',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--VE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vela');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vela');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);		
-------
 
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_lm');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Lonja/Mercado/Feria',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tipo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tipo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;					

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ferja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ferja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ferja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ferja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ferja');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FE',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Lonja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Lonja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Lonja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Lonja');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Lonja');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LO',currval('seq_dictionary'),7,null,@idDomainNode,null);	
	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mercado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mercado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mercado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mercado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mercado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ME',currval('seq_dictionary'),7,null,@idDomainNode,null);	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad Lonja Mercado',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
		--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--CO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--CP
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cofrad�a de pescadores');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CP',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--EM
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--EP
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--MA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--MU
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	--PV
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--VE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
  	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor Lonja Mercado',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gesti�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
		--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	
	--CO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Consorcio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Consorcio');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--CP
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cofrad�a de pescadores');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cofrad�a de pescadores');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CP',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--EM
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EM',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--EP
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Empresa P�blica no municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Empresa P�blica no municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EP',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--MA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mancomunidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mancomunidad');
	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MA',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--MU
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);		
	
	--PV
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privada');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privada');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);		

	--VE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vecinal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vecinal');
  	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VE',currval('seq_dictionary'),7,null,@idDomainNode,null);		
--------
--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_ta');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titularidad Tanatorios',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
		--MU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipio');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PU 
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Organismo P�blico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privado');
	
  	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);
  				

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Gestor Tanatorios',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Gesti�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Gesti�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
		--MU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipio');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PU 
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Organismo P�blico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Organismo P�blico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Privado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Privado');
	
  	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PV',currval('seq_dictionary'),7,null,@idDomainNode,null);
-----  				
  				
 -- insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_carreteras');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Titular Via',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Titularidad');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Titularidad');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--CA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Comunidad Aut�noma');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Comunidad Aut�noma');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CA',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	--CH
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Confederaciones Hidrogr�ficas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Confederaciones Hidrogr�ficas');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CH',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	--ES	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estado');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ES',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	--MU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Municipal');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MU',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otras');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otras');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
		
	
	--PR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Provincial/Insular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Provincial/Insular');	

		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PR',currval('seq_dictionary'),7,null,@idDomainNode,null);
-------		
-- insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t1_saneam_ed');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Sist. de depuraci�n, Tratamientos avanzados',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamiento avanzado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamiento avanzado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamiento avanzado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamiento avanzado');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamiento avanzado');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--CL
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cloraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cloraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cloraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cloraci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cloraci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CL',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--FA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Filtro de arena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Filtro de arena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Filtro de arena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Filtro de arena');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Filtro de arena');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--FM
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Filtraci�n por membranas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Filtraci�n por membranas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Filtraci�n por membranas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Filtraci�n por membranas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Filtraci�n por membranas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FM',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--NO
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--OZ
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Oxidaci�n con Ozono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Oxidaci�n con Ozono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Oxidaci�n con Ozono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Oxidaci�n con Ozono');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Oxidaci�n con Ozono');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OZ',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--UN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Eliminaci�n de nutrientes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Eliminaci�n de nutrientes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Eliminaci�n de nutrientes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Eliminaci�n de nutrientes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Eliminaci�n de nutrientes');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UN',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--UT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ultravioletas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ultravioletas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ultravioletas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ultravioletas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ultravioletas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'UT',currval('seq_dictionary'),7,null,@idDomainNode,null);


insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Sist. de depuraci�n, Tratamientos de fangos o lodos',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamiento de lodos (1)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamiento de lodos (1)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamiento de lodos (1)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamiento de lodos (1)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamiento de lodos (1)');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	
	--CO
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Compostaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Compostaje');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--DA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Digesti�n aerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Digesti�n aerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Digesti�n aerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Digesti�n aerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Digesti�n aerobica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--DN
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Digesti�n anaerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Digesti�n anaerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Digesti�n anaerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Digesti�n anaerobica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Digesti�n anaerobica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--EC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Estabilizaci�n con Cal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Estabilizaci�n con Cal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Estabilizaci�n con Cal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Estabilizaci�n con Cal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Estabilizaci�n con Cal');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'EC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--NO
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--TT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamiento t�rmico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Sist. de depuraci�n, Tratamiento primario',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamiento primario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamiento primario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamiento primario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamiento primario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamiento primario');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
		SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--DC
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Decantador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Decantador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Decantador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Decantador');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Decantador');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--DG
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Decantador- Digestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Decantador- Digestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Decantador- Digestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Decantador- Digestor');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Decantador- Digestor');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DG',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--FQ
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','F�sico Qu�mico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','F�sico Qu�mico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','F�sico Qu�mico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','F�sico Qu�mico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','F�sico Qu�mico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FQ',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--FS
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fosa S�ptica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fosa S�ptica');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--LN	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Laguna anaerobia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Laguna anaerobia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Laguna anaerobia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Laguna anaerobia');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Laguna anaerobia');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--NO	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamiento t�rmico');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamiento t�rmico');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CO',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Sist. de depuraci�n, Tratamiento secundario',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamiento secundario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamiento secundario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamiento secundario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamiento secundario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamiento secundario');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;	

	--CB
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Contadores biol�gicos rotativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Contadores biol�gicos rotativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Contadores biol�gicos rotativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Contadores biol�gicos rotativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Contadores biol�gicos rotativos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--ES
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Escorrent�a superficial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Escorrent�a superficial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Escorrent�a superficial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Escorrent�a superficial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Escorrent�a superficial');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ES',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--FA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Fangos activados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Fangos activados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Fangos activados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Fangos activados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Fangos activados');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--FV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Filtro verde');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Filtro verde');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Filtro verde');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Filtro verde');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Filtro verde');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'FV',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--IR
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Infiltraci�n r�pida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Infiltraci�n r�pida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Infiltraci�n r�pida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Infiltraci�n r�pida');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Infiltraci�n r�pida');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'IR',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--LA
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sistema de lagunaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sistema de lagunaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sistema de lagunaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sistema de lagunaje');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sistema de lagunaje');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LA',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--LB
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Lechos bacterianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Lechos bacterianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Lechos bacterianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Lechos bacterianos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Lechos bacterianos');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LB',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--LT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Lechos de turba');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Lechos de turba');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Lechos de turba');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Lechos de turba');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Lechos de turba');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'LT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--NO
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No existe');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No existe');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--PE
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plantas emergentes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plantas emergentes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plantas emergentes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plantas emergentes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plantas emergentes');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PE',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
	--ZF
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Zanjas, lechoso pozos filtrantes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Zanjas, lechoso pozos filtrantes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Zanjas, lechoso pozos filtrantes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Zanjas, lechoso pozos filtrantes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Zanjas, lechoso pozos filtrantes');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ZF',currval('seq_dictionary'),7,null,@idDomainNode,null);
-------
---insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_cc_usos');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Usos Casas Consistoriales',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Usos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--AA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Almacenes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Almacenes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Almacenes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Almacenes');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Almacenes');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--AM
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Administrativo municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Administrativo municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Administrativo municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Administrativo municipal');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Administrativo municipal');
	
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AM',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--AS
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Asistencial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--BA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Biblioteca');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--BR
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ocio y cafeteria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ocio y cafeteria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ocio y cafeteria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ocio y cafeteria');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ocio y cafeteria');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CI
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cine o Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cine o Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cine o Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cine o Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cine o Teatro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CI',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--MO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Museo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros usos administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros usos administrativos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--PN
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hogar del pensionista');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PN',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--SA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Sanitario');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SA',currval('seq_dictionary'),7,null,@idDomainNode,null);

	
	--SO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','C�vico Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','C�vico Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','C�vico Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','C�vico Social');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','C�vico Social');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VI
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Viviendas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VI',currval('seq_dictionary'),7,null,@idDomainNode,null);
--------
-- insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_cu_usos');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Tipos de usos de los Centros culturales',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Usos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Usos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;
	--AO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Auditorio');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Auditorio');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--BA
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Biblioteca');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Biblioteca');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BA',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--BR
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bar, restaurante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bar, restaurante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bar, restaurante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bar, restaurante');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bar, restaurante');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'BR',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--CI	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cine');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cine');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CI',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--CV
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','C�vico Social (Comprende el lugar de reuniones de las Asociaciones de Vecinos, C�rculos, Ateneos,etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','C�vico Social (Comprende el lugar de reuniones de las Asociaciones de Vecinos, C�rculos, Ateneos,etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','C�vico Social (Comprende el lugar de reuniones de las Asociaciones de Vecinos, C�rculos, Ateneos,etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','C�vico Social (Comprende el lugar de reuniones de las Asociaciones de Vecinos, C�rculos, Ateneos,etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','C�vico Social (Comprende el lugar de reuniones de las Asociaciones de Vecinos, C�rculos, Ateneos,etc)');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CV',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--DC	
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Documental');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Documental');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Documental');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Documental');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Documental');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'DC',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--ED
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Educativo(Se refiere a las ense�anzas no oficiales como Escuela de m�sica(no homologada), ense�anza de idiomas, fotograf�a, pintura, etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Educativo(Se refiere a las ense�anzas no oficiales como Escuela de m�sica(no homologada), ense�anza de idiomas, fotograf�a, pintura, etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Educativo(Se refiere a las ense�anzas no oficiales como Escuela de m�sica(no homologada), ense�anza de idiomas, fotograf�a, pintura, etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Educativo(Se refiere a las ense�anzas no oficiales como Escuela de m�sica(no homologada), ense�anza de idiomas, fotograf�a, pintura, etc)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Educativo(Se refiere a las ense�anzas no oficiales como Escuela de m�sica(no homologada), ense�anza de idiomas, fotograf�a, pintura, etc)');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'ED',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--KM
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Kiosco de m�sica');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Kiosco de m�sica');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'KM',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	--MO
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Museo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Museo');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'MO',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	
	--OT
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros tipos (Corresponde al uso que no se contempla en los apartados anteriores, debe figurar en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros tipos (Corresponde al uso que no se contempla en los apartados anteriores, debe figurar en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros tipos (Corresponde al uso que no se contempla en los apartados anteriores, debe figurar en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros tipos (Corresponde al uso que no se contempla en los apartados anteriores, debe figurar en observaciones)');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros tipos (Corresponde al uso que no se contempla en los apartados anteriores, debe figurar en observaciones)');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	
	--PN
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Hogar del pensionista');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Hogar del pensionista');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PN',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	
	--PS
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Plaza de toros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Plaza de toros');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'PS',currval('seq_dictionary'),7,null,@idDomainNode,null);
 
	
	--TE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Teatro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Teatro');
	
		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'TE',currval('seq_dictionary'),7,null,@idDomainNode,null);
--------
-- insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','eiel_t_su');
--insert into domaincategory values  (nextval('seq_domaincategory'),currval('seq_dictionary'));

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_uso_anterior',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Uso anterior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Uso anterior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Uso anterior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Uso anterior');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Uso anterior');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);											
	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;		
	--AS
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro Asistencial');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro Asistencial');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--AY
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ayuntamiento/Administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ayuntamiento/Administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ayuntamiento/Administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ayuntamiento/Administrativos');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ayuntamiento/Administrativos');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'AY',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CC
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro Cultural');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro Cultural');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro Cultural');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro Cultural');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro Cultural');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CC',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CE
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro de Ense�anza ');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro de Ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro de Ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro de Ense�anza');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro de Ense�anza');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CE',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CR
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cuartel/Comunidad religiosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cuartel/Comunidad religiosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cuartel/Comunidad religiosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cuartel/Comunidad religiosa');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cuartel/Comunidad religiosa');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CR',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--CS
		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centro Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centro Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centro Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centro Sanitario');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centro Sanitario');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'CS',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--JU
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Juzgados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Juzgados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Juzgados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Juzgados');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Juzgados');
		
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'JU',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--OT
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros');

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'OT',currval('seq_dictionary'),7,null,@idDomainNode,null);

	--VI 
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Viviendas');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Viviendas');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'VI',currval('seq_dictionary'),7,null,@idDomainNode,null);
-----
	insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Servicio de limpieza de calles',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Servicio de limpieza de calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Servicio de limpieza de calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Servicio de limpieza de calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Servicio de limpieza de calles');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Servicio de limpieza de calles');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','No');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','No');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'NO',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Si');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Si');
	

	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'SI',currval('seq_dictionary'),7,null,@idDomainNode,null);

insert into domains (ID, NAME,idacl,ID_CATEGORY)values(nextval('seq_domains'),'eiel_Calidad del servicio o suministro',(select idacl FROM acl WHERE name='EIEL'),5);

  	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Calidad del servicio o suministro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Calidad del servicio o suministro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Calidad del servicio o suministro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Calidad del servicio o suministro');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Calidad del servicio o suministro');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  		values(nextval('seq_domainnodes'),currval('seq_domains'),null,currval('seq_dictionary'),4,null,null,null);			
  	SET @idDomainNode= select currval('seq_domainnodes') from seq_domainnodes;			
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Bueno');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Bueno');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'B',currval('seq_dictionary'),7,null,@idDomainNode,null);

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Ejecuci�n');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Ejecuci�n');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'E',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Malo');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Malo');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'M',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Carece');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Carece');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'C',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Regular');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Regular');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),currval('seq_domains'),'R',currval('seq_dictionary'),7,null,@idDomainNode,null);
	
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
--------
  -- Generar dominio con las tablas

insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Abastecimiento de Agua');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Abastecimiento de Agua');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Abastecimiento de Agua');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Abastecimiento de Agua');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Abastecimiento de Agua');
  
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),@idDomainEiel,'AA',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);

SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;	
	  			
				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'ga_ES','Captaciones');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'es_ES','Captaciones');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Captaciones');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Captaciones');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Captaciones');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 		values(nextval('seq_domainnodes'),@idDomainEiel,'CA',currval('seq_dictionary'),7,null,@idDomainParent,null);

				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Dep�sitos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Dep�sitos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Dep�sitos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Dep�sitos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Dep�sitos');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 		values(nextval('seq_domainnodes'),@idDomainEiel,'DE',currval('seq_dictionary'),7,null,@idDomainParent,null);
						
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tratamientos de potabilizaci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tratamientos de potabilizaci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tratamientos de potabilizaci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tratamientos de potabilizaci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tratamientos de potabilizaci�n');
			
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 		values(nextval('seq_domainnodes'),@idDomainEiel,'TP',currval('seq_dictionary'),7,null,@idDomainParent,null);
				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tramo de Conducci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tramo de Conducci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tramo de Conducci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tramo de Conducci�n');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tramo de Conducci�nn');
					
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 		values(nextval('seq_domainnodes'),@idDomainEiel,'CN',currval('seq_dictionary'),7,null,@idDomainParent,null);
				
				
					 		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nuc_enc_2 Informaci�n relativa al abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nuc_enc_2 Informaci�n relativa al abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_2 Informaci�n relativa al abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_2 Informaci�n relativa al abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_2 Informaci�n relativa al abastecimiento');
					
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
							values(nextval('seq_domainnodes'),@idDomainEiel,'P2',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nuc_enc_3 Datos del servicio de abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nuc_enc_3 Datos del servicio de abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_3 Datos del servicio de abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_3 Datos del servicio de abastecimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_3 Datos del servicio de abastecimiento');
		
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'DSA',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'ga_ES','Nuc_enc_4 Abastecimiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'es_ES','Nuc_enc_4 Abastecimiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_4 Abastecimiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_4 Abastecimiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_4 Abastecimiento aut�nomo');
					
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
					 		values(nextval('seq_domainnodes'),@idDomainEiel,'AB',currval('seq_dictionary'),7,null,@idDomainParent,null);
				
  
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Saneamiento');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Saneamiento');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Saneamiento');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Saneamiento');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Saneamiento');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
	  	values(nextval('seq_domainnodes'),@idDomainEiel,'SA',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Depuradoras 1');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Depuradoras 1');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Depuradoras 1');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Depuradoras 1');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Depuradoras 1');
							
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'D1',currval('seq_dictionary'),7,null,@idDomainParent,null);
		
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Depuradoras 2');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Depuradoras 2');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Depuradoras 2');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Depuradoras 2');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Depuradoras 2');
							
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'D2',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Puntos de vertido');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Puntos de vertido');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Puntos de vertido');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Puntos de vertido');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Puntos de vertido');
							
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'PV',currval('seq_dictionary'),7,null,@idDomainParent,null);
			
	 			--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Relaci�n punto vertido-emisario');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Relaci�n punto vertido-emisario');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Relaci�n punto vertido-emisario');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Relaci�n punto vertido-emisario');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Relaci�n punto vertido-emisario');
							
				--insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		 		--		values(nextval('seq_domainnodes'),@idDomainEiel,'PVE',currval('seq_dictionary'),7,null,@idDomainParent,null);

		 		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Saneamiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Saneamiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Saneamiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Saneamiento aut�nomo');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Saneamiento aut�nomo');
							
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'SN',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Emisario');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Emisario');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Emisario');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Emisario');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Emisario');
							
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'EM',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Colector');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Colector');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Colector');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Colector');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Colector');
							
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'CL',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nuc_enc_5 Datos del servicio de saneamiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nuc_enc_5 Datos del servicio de saneamiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_5 Datos del servicio de saneamiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_5 Datos del servicio de saneamiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_5 Datos del servicio de saneamiento');
								
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
							values(nextval('seq_domainnodes'),@idDomainEiel,'DSS',currval('seq_dictionary'),7,null,@idDomainParent,null);


  
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Equipamientos');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Equipamientos');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Equipamientos');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Equipamientos');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Equipamientos');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),@idDomainEiel,'EQ',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;


				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Casa consistorial');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Casa consistorial');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Casa consistorial');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Casa consistorial');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Casa consistorial');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
							values(nextval('seq_domainnodes'),@idDomainEiel,'CC',currval('seq_dictionary'),7,null,@idDomainParent,null);
							
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Casa consistorial(usos)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Casa consistorial(usos)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Casa consistorial(usos)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Casa consistorial(usos)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Casa consistorial(usos)');
				
			--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
			--				values(nextval('seq_domainnodes'),@idDomainEiel,'CCU',currval('seq_dictionary'),7,null,@idDomainParent,null);


				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cementerios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cementerios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cementerios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cementerios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cementerios');

				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'CE',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros asistenciales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros asistenciales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros asistenciales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros asistenciales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros asistenciales');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 		values(nextval('seq_domainnodes'),@idDomainEiel,'AS',currval('seq_dictionary'),7,null,@idDomainParent,null);
			
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros culturales y de esparcimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros culturales y de esparcimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros culturales y de esparcimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros culturales y de esparcimiento');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros culturales y de esparcimiento');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'CU',currval('seq_dictionary'),7,null,@idDomainParent,null);

		--		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros de ense�anza (niveles)');
		--		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros de ense�anza (niveles)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros de ense�anza (niveles)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros de ense�anza (niveles)');
			--	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros de ense�anza (niveles)');
				
			--	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
			--	 			values(nextval('seq_domainnodes'),@idDomainEiel,'ENN',currval('seq_dictionary'),7,null,@idDomainParent,null);
				 			
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros de ense�anza');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros de ense�anza');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros de ense�anza');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros de ense�anza');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros de ense�anza');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'EN',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros de extinci�n de incendios y protecci�n civil');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros de extinci�n de incendios y protecci�n civil');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros de extinci�n de incendios y protecci�n civil');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros de extinci�n de incendios y protecci�n civil');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros de extinci�n de incendios y protecci�n civil');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'PI',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Centros sanitarios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Centros sanitarios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Centros sanitarios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Centros sanitarios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Centros sanitarios');

				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'CS',currval('seq_dictionary'),7,null,@idDomainParent,null);
				 			
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Edificios sin uso');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Edificios sin uso');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Edificios sin uso');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Edificios sin uso');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Edificios sin uso');

				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'ES',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Instalaci�n deportiva');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Instalaci�n deportiva');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Instalaci�n deportiva');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Instalaci�n deportiva');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Instalaci�n deportiva');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'ID',currval('seq_dictionary'),7,null,@idDomainParent,null);

				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Instalaci�n deportiva (deportes)');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Instalaci�n deportiva (deportes)');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Instalaci�n deportiva (deportes)');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Instalaci�n deportiva (deportes)');
				--insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Instalaci�n deportiva (deportes)');
				
				--insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 --			values(nextval('seq_domainnodes'),@idDomainEiel,'IDD',currval('seq_dictionary'),7,null,@idDomainParent,null);

				 			
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Lonjas, mercados y recintos feriales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Lonjas, mercados y recintos feriales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Lonjas, mercados y recintos feriales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Lonjas, mercados y recintos feriales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Lonjas, mercados y recintos feriales');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'LO',currval('seq_dictionary'),7,null,@idDomainParent,null);

				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Mataderos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Mataderos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Mataderos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Mataderos');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Mataderos');

				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'MA',currval('seq_dictionary'),7,null,@idDomainParent,null);
				 				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Parques, jardines y �reas naturales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Parques, jardines y �reas naturales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Parques, jardines y �reas naturales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Parques, jardines y �reas naturales');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Parques, jardines y �reas naturales');

				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'PA',currval('seq_dictionary'),7,null,@idDomainParent,null);

				
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tanatorios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tanatorios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tanatorios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tanatorios');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tanatorios');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 				values(nextval('seq_domainnodes'),@idDomainEiel,'TA',currval('seq_dictionary'),7,null,@idDomainParent,null);	

insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Red de carreteras');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Red de carreteras');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Red de carreteras');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Red de carreteras');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Red de carreteras');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),@idDomainEiel,'RC',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);

SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;

  				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Tramos carretera');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Tramos carretera');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Tramos carretera');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Tramos carretera');
				insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Tramos carretera');
				
				insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				 			values(nextval('seq_domainnodes'),@idDomainEiel,'TC',currval('seq_dictionary'),7,null,@idDomainParent,null);

  				
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Vertedero');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Vertedero');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Vertedero');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Vertedero');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Vertedero');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),@idDomainEiel,'VT',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;

	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Datos del vertedero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Datos del vertedero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Datos del vertedero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Datos del vertedero');
	insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Datos del vertedero');
	
	insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
	  				values(nextval('seq_domainnodes'),@idDomainEiel,'VE',currval('seq_dictionary'),7,null,@idDomainParent,null);
	  				
	
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Informaci�n general del n�cleo');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Informaci�n general del n�cleo');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Informaci�n general del n�cleo');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Informaci�n general del n�cleo');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Informaci�n general del n�cleo');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
	  				values(nextval('seq_domainnodes'),@idDomainEiel,'NP',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;	
	  		
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Padr�n n�cleo de poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Padr�n n�cleo de poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Padr�n n�cleo de poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Padr�n n�cleo de poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Padr�n n�cleo de poblaci�n');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				  values(nextval('seq_domainnodes'),@idDomainEiel,'PN',currval('seq_dictionary'),7,null,@idDomainParent,null);
							
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nuc_enc_6 D�ficit y servicio limpieza calles');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nuc_enc_6 D�ficit y servicio limpieza calles');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_6 D�ficit y servicio limpieza calles');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_6 D�ficit y servicio limpieza calles');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_6 D�ficit y servicio limpieza calles');

			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
						values(nextval('seq_domainnodes'),@idDomainEiel,'SR',currval('seq_dictionary'),7,null,@idDomainParent,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nuc_enc_7 Otras informaciones');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nuc_enc_7 Otras informaciones');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_7 Otras informaciones');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_7 Otras informaciones');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_7 Otras informaciones');
		
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
					values(nextval('seq_domainnodes'),@idDomainEiel,'N7',currval('seq_dictionary'),7,null,@idDomainParent,null);
		
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Recogida de basuras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Recogida de basuras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Recogida de basuras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Recogida de basuras');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Recogida de basuras');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				  	values(nextval('seq_domainnodes'),@idDomainEiel,'RB',currval('seq_dictionary'),7,null,@idDomainParent,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Poblamiento');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Poblamiento');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Poblamiento');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Poblamiento');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Poblamiento');
				
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
					values(nextval('seq_domainnodes'),@idDomainEiel,'PO',currval('seq_dictionary'),7,null,@idDomainParent,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Nuc_enc_1 Informaci�n relativa a la poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Nuc_enc_1 Informaci�n relativa a la poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Nuc_enc_1 Informaci�n relativa a la poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Nuc_enc_1 Informaci�n relativa a la poblaci�n');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Nuc_enc_1 Informaci�n relativa a la poblaci�n');
				
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
					values(nextval('seq_domainnodes'),@idDomainEiel,'P1',currval('seq_dictionary'),7,null,@idDomainParent,null);

			
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Informaci�n general del municipio');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Informaci�n general del municipio');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Informaci�n general del municipio');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Informaci�n general del municipio');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Informaci�n general del municipio');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
			values(nextval('seq_domainnodes'),@idDomainEiel,'MP',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;			
	  	
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Padr�n t�rmino municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Padr�n t�rmino municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Padr�n t�rmino municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Padr�n t�rmino municipal');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Padr�n t�rmino municipal');
  
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
							 				values(nextval('seq_domainnodes'),@idDomainEiel,'PM',currval('seq_dictionary'),7,null,@idDomainParent,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Planeamiento urban�stico');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Planeamiento urban�stico');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Planeamiento urban�stico');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Planeamiento urban�stico');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Planeamiento urban�stico');

			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
  				values(nextval('seq_domainnodes'),@idDomainEiel,'PU',currval('seq_dictionary'),7,null,@idDomainParent,null);
  				
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Otros servicios municipales');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Otros servicios municipales');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Otros servicios municipales');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Otros servicios municipales');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Otros servicios municipales');

			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
	  				values(nextval('seq_domainnodes'),@idDomainEiel,'OS',currval('seq_dictionary'),7,null,@idDomainParent,null);

	  		
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Entidades singulares');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Entidades singulares');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Entidades singulares');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Entidades singulares');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Entidades singulares');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
					values(nextval('seq_domainnodes'),@idDomainEiel,'SI',currval('seq_dictionary'),7,null,@idDomainParent,null);

			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Agrupaciones 6000');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Agrupaciones 6000');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Agrupaciones 6000');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Agrupaciones 6000');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Agrupaciones 6000');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
					values(nextval('seq_domainnodes'),@idDomainEiel,'A6',currval('seq_dictionary'),7,null,@idDomainParent,null);

	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Diseminado no encuestado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Diseminado no encuestado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Diseminado no encuestado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Diseminado no encuestado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Diseminado no encuestado');

	  		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
	  				values(nextval('seq_domainnodes'),@idDomainEiel,'DI',currval('seq_dictionary'),7,null,@idDomainParent,null);

	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','N�cleo abandonado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','N�cleo abandonado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','N�cleo abandonado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','N�cleo abandonado');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','N�cleo abandonado');

	  		insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
	  				values(nextval('seq_domainnodes'),@idDomainEiel,'NA',currval('seq_dictionary'),7,null,@idDomainParent,null);

insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Informaci�n general de la provincia');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Informaci�n general de la provincia');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Informaci�n general de la provincia');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Informaci�n general de la provincia');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Informaci�n general de la provincia');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
			values(nextval('seq_domainnodes'),@idDomainEiel,'PP',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;		  				
	  				
	  		insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Cabildo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Cabildo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Cabildo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Cabildo');
			insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Cabildo');
			
			insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
				values(nextval('seq_domainnodes'),@idDomainEiel,'CI',currval('seq_dictionary'),7,null,@idDomainParent,null);


-- Faltaria a�adir el dominio de alumbrado 										  	
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Alumbrado');

insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
			values(nextval('seq_domainnodes'),@idDomainEiel,'ALUM',currval('seq_dictionary'),7,null,@idDomainNodeEIEL,null);
SET @idDomainParent= select currval('seq_domainnodes') from seq_domainnodes;			
	  	
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(nextval('seq_dictionary'),'es_ES','Infraestructura Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ga_ES','Infraestructura Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'va_ES','Infraestructura Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'eu_ES','Infraestructura Alumbrado');
insert into DICTIONARY (ID_VOCABLO,LOCALE,TRADUCCION)values(currval('seq_dictionary'),'ca_ES','Infraestructura Alumbrado');
  
insert into domainnodes (id,id_domain, pattern,  ID_DESCRIPTION, "type",permissionlevel, parentdomain,id_municipio)
		 				values(nextval('seq_domainnodes'),@idDomainEiel,'ALUM',currval('seq_dictionary'),7,null,@idDomainParent,null);			
	  						