# 🧠 Experiencia Sumativa 1 – Desarrollo Orientado a Objetos

## 👤 Autor del proyecto

- **Nombre:** Felipe Saldías Cofré
- **Carrera:** Analista Programador Computacional
- **Sede:** DuocUC - Online

---

## 💻 Descripción general del sistema

Este proyecto llamado **RegistroDePersonasLlanquihueTour** corresponde a la actividad sumativa 1 de la asignatura **Desarrollo Orientado a Objetos**.

La solución desarrollada consiste en un sistema orientado a objetos para la agencia de turismo **Llanquihue Tour**, cuyo objetivo es representar y gestionar información relacionada con personas vinculadas a la empresa.

Para su implementación se aplicaron conceptos fundamentales de Programación Orientada a Objetos, tales como encapsulamiento, herencia, composición, reutilización de clases y manejo de excepciones personalizadas.

El sistema permite simular el registro de proveedores de transporte y alojamiento, validando información como RUT, correo electrónico y patente de vehículos mediante clases especializadas.

---

## 🧱 Estructura general del proyecto

```text
src/
├── app/
│   └── Main.java
│
├── model/
│   ├── Persona.java
│   ├── Direccion.java
│   ├── Rut.java
│   ├── Correo.java
│   ├── Patente.java
│   ├── ProveedorTransporte.java
│   ├── Vehiculo.java
│   ├── ProveedorAlojamiento.java
│   └── Alojamiento.java
│
└── util/
    ├── RegistroHelper.java
    ├── RutInvalidoException.java
    ├── CorreoInvalidoException.java
    └── PatenteInvalidaException.java
```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/fiscfelipe/Sum1_DOO_RegistroDePersonasLlanquihueTour.git
```

2. Abre el proyecto en Apache NetBeans.

3. Ejecuta el archivo `Main.java` desde el paquete `app`.

4. Observa los ejemplos mostrados por consola y utiliza el menú interactivo para simular el registro de proveedores.

**nota:** También existe la opción de descargarlo como un archivo .zip desde el menú desplegable en la parte superior (<> Code).

---

**Repositorio GitHub:** https://github.com/fiscfelipe/Sum1_DOO_RegistroDePersonasLlanquihueTour

**Fecha de entrega:** 08/06/2026
