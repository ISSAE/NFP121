# 
#
verbose=true

bean.id.1=table
table.class=question1.exemples.Table
table.property.1=liste
table.property.1.param.1=arrayList
table.property.2=capacite
table.property.2.param.1=4

bean.id.2=arrayList
arrayList.class=java.util.ArrayList

bean.id.3=table2
table2.class=question1.exemples.Table
table2.property.1=liste
table2.property.1.param.1=linkedList
table2.property.2=capacite
table2.property.2.param.1=4

bean.id.4=linkedList
linkedList.class=java.util.LinkedList

bean.id.5=tableSet
tableSet.class=question1.exemples.Table
tableSet.property.1=liste
tableSet.property.1.param.1=set
tableSet.property.2=capacite
tableSet.property.2.param.1=4

bean.id.6=set
set.class=java.util.TreeSet

# http://www.springbyexample.org/static/1.5/html/intro-to-ioc-creating-a-spring-application.html
bean.id.7=message
message.class=question1.exemples.Message
message.property.1=message
message.property.1.param.1=Cnam/NFP121 femtoContainer is fun

# tests de différents appels de mutateur
bean.id.8=properties
properties.class=question1.exemples.PropertiesType
properties.property.1=b
properties.property.1.param.1=1
properties.property.2=s
properties.property.2.param.1=1
properties.property.3=i
properties.property.3.param.1=1
properties.property.4=l
properties.property.4.param.1=1
properties.property.5=f
properties.property.5.param.1=1.0
properties.property.6=d
properties.property.6.param.1=1.0
properties.property.7=bool
properties.property.7.param.1=true
properties.property.8=c
properties.property.8.param.1=\u20ac
#properties.property.8.param.1=a
properties.property.9=tables
properties.property.9.param.1=table table2 tableSet
properties.property.10=tab
properties.property.10.param.1=1 2 3 4 5 6 7 8
properties.property.11=classe
properties.property.11.param.1=java.lang.String.class



bean.id.9=ihm
ihm.class=question1.exemples.IHM
ihm.property.1=jFrame
ihm.property.1.param.1=jframe
ihm.property.2=layout
ihm.property.2.param.1=layout
ihm.property.3=listener
ihm.property.3.param.1=action

bean.id.10=layout
layout.class=java.awt.FlowLayout

bean.id.11=action
action.class=question1.exemples.ActionAuClick
action.property.1=ihm
action.property.1.param.1=ihm

bean.id.12=jframe
jframe.class=javax.swing.JFrame
jframe.property.1=title
jframe.property.1.param.1=Cnam/NFP121femtoContainer

bean.id.13=modele
modele.class=question1.exemples.Modele
modele.property.1=vue
modele.property.1.param.1=vue

bean.id.14=vue
vue.class=question1.exemples.Vue
vue.property.1=controleur
vue.property.1.param.1=controleur

bean.id.15=controleur
controleur.class=question1.exemples.Controleur
controleur.property.1=modele
controleur.property.1.param.1=modele

bean.id.16=cours
cours.class=question1.exemples.Cours
cours.property.1=service
cours.property.1.param.1=service

bean.id.17=service
service.class=question1.exemples.ListeEnCSV

bean.id.18=config_editor
config_editor.class=config_editor.GUI



