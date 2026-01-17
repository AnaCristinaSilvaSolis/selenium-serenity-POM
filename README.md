# 🧪 Automatización de Flujos Críticos – E2E Testing

Proyecto de automatización de pruebas End-to-End enfocado en validar los **flujos críticos de una aplicación web**,
asegurando el correcto comportamiento del sistema ante escenarios negativos y positivos del usuario.

El objetivo principal es **detectar fallos funcionales de forma temprana**, mejorar la calidad del software y servir
como base escalable para futuras pruebas automatizadas.

---

## 📌 Flujos Automatizados

### 🔐 Login

Validación del proceso de autenticación bajo escenarios positivos y negativos:

- Inicio de sesión con **credenciales correctas**
- Inicio de sesión con **credenciales incorrectas**
- Verificación de mensajes de error esperados

### 🛒 Productos

Validación del comportamiento de la sección de productos:

- Añadir **items** al carrito
- Verificar que el **contador del carrito muestre la cantidad de productos añadidos**
- Ordenar productos por **precio de menor a mayor**

### 🚪 Logout

- Cierre de sesión desde el **menú hamburguesa**
- Confirmación del retorno a la pantalla de login

---

## 🧠 Alcance de las Pruebas

- Pruebas funcionales automatizadas
- Enfoque End-to-End (E2E)
- Validación de reglas de negocio visibles para el usuario
- No se cubren pruebas de performance ni seguridad

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java
- **Framework de automatización:** Selenium WebDriver
- **Patrón de diseño:** POM
- **Gestión de dependencias:** Gradle
- **Framework de testing:** JUnit
- **Reporte:** Serenity Reports
- **Control de versiones:** Git

---
👤 Autor

Ana Cristina Silva Solis
QA Automation Engineer