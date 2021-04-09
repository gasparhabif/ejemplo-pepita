# java-base-project

# Enunciado

Modelar a Pepita: 

* Es una instancia de la clase `Golondrina`
* Puede `volar()`, lo cual descuenta su energia en 10 unidades
* Puede `comer(alpista)`, lo cual aumenta su energia en 3 veces la cantidad de alpiste
* Al crearla, es posible especificar su cantidad de energía inicial

Ejemplo: 

```java
Golondrina pepita = new Golondrina(40);
pepita.comer(23);
pepita.volar();
pepita.getEnergia(); 
```

# Ejecutar tests

```
mvn test
```

# Validar el proyecto de forma exahustiva

```
mvn verify
```

Este comando hará lo siguiente:

 1. Ejecutará los tests
 2. Validará las convenciones de formato mediante checkstyle
 3. Detectará la presencia de (ciertos) code smells
 4. Validará la cobertura del proyecto

# Entrega del proyecto

Para entregar el proyecto, crear un tag llamado `entrega-final`. Es importante que antes de realizarlo se corra la validación
explicada en el punto anterior. Se recomienda hacerlo de la siguiente forma:

```
mvn verify && git tag entrega-final && git push origin HEAD --tags
```

# Configuración del IDE

 1. Tabular con dos espacios
 2. Instalar y configurar Checkstyle
 3. Usar fin de linea unix