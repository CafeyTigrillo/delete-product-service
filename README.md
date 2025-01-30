# Delete Product Service

## 🚀 Overview

The **Delete Product Service** is a simple RESTful API designed to delete a specific product from the database by its unique identifier (`id_product`). Built with **Spring Boot** and integrated with **JPA**, this service allows you to easily remove a product from your inventory or database.

This API is ideal for e-commerce platforms, inventory management systems, or any application that needs to manage products by deleting them on request.

## 🌟 Key Features

- **RESTful API**: Exposes an endpoint to delete a product by its ID.
- **JPA Integration**: Uses Java Persistence API for seamless interaction with the database.
- **Simple Product Deletion**: Deletes the product with the given ID from the database.

## 🔑 API Endpoint

- **DELETE** `/products/{id_product}`:  
  Deletes the product from the database based on the provided product ID.

  **Response**:
  The API returns a `204 No Content` status when the product is successfully deleted.

  **Error Handling**:
  If the product with the given ID is not found, the service may return a `404 Not Found` error.

## 🔧 Technologies Used

- **Spring Boot**: Framework used for building the application.
- **JPA** (Java Persistence API): Handles interactions with the database for deleting products.
- **H2 Database** (or any relational database): Stores product data.
- **Java**: The programming language used to develop the service.

## 💡 Use Case

This service is useful in scenarios where you need to delete products from an e-commerce platform, inventory management system, or any other application dealing with product data. By providing a simple DELETE endpoint, this service makes it easy to manage product data removal.

---

This version explains what the service does, the endpoint details, and the technologies used in a clean and concise manner. Let me know if you need further adjustments!
