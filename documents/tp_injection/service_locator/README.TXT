
#verbose=true


# exemples
bean.id.1=exemples
exemples.class=container.FileSystemPropsApplicationContext
exemples.property.1=fileName
exemples.property.1.param.1=./question1/exemples/README.TXT
# le ichier de config se trouve à une url, cf. répertoire serveurWeb8086 
# avec console> java ServeurWeb886 au préalable
#exemples.property.1=url
#exemples.property.1.param.1=http://localhost:8086/config.props
exemples.property.2=name
exemples.property.2.param.1=EXEMPLES

# patron_commande
bean.id.2=patron_commande
patron_commande.class=container.FileSystemPropsApplicationContext
patron_commande.property.1=fileName
patron_commande.property.1.param.1=./question1/patron_commande/README.TXT
patron_commande.property.2=name
patron_commande.property.2.param.1=PATRON_COMMANDE


bean.id.3=serviceLocator
serviceLocator.class=service_locator.ServiceLocator
serviceLocator.property.1=container
serviceLocator.property.1.param.1=exemples
serviceLocator.property.2=container
serviceLocator.property.2.param.1=patron_commande



