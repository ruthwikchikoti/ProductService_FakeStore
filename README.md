# ProductService_FakeStore

## Overview
ProductService_FakeStore is a Java Spring Boot application providing RESTful APIs for managing products and cart services. It interacts with the FakeStoreApi to perform various operations.following MVC 

## Cart Service API

### Endpoints

#### Get All Cart Items
- **Endpoint:** `/carts`
- **Method:** `GET`
- **Description:** Fetches all cart items.
- **Response:** Array of FakeStoreApi objects.

#### Get Cart Item
- **Endpoint:** `/carts/{id}`
- **Method:** `GET`
- **Description:** Fetches a specific cart item by its ID.
- **Parameters:** `id (Long)` - ID of the cart item.
- **Response:** FakeStoreApi object.

#### Get Cart By User
- **Endpoint:** `/carts/user/{id}`
- **Method:** `GET`
- **Description:** Fetches a cart by a specific user ID.
- **Parameters:** `id (Long)` - ID of the user.
- **Response:** FakeStoreApi object.

#### Get Carts In Range
- **Endpoint:** `/carts?startdate={startDate}&enddate={endDate}`
- **Method:** `GET`
- **Description:** Fetches all carts within a specific date range.
- **Parameters:** `startDate (String)`, `endDate (String)` - Start and end dates in 'yyyy-MM-dd' format.
- **Response:** Array of FakeStoreApi objects.

#### Update Cart Item
- **Endpoint:** `/carts/{id}`
- **Method:** `PATCH`
- **Description:** Updates a specific cart item.
- **Parameters:** FakeStoreApi object.
- **Response:** FakeStoreApi object.

#### Add Cart Item
- **Endpoint:** `/carts/`
- **Method:** `POST`
- **Description:** Adds a new cart item.
- **Parameters:** FakeStoreApi object.
- **Response:** FakeStoreApi object.

#### Delete Cart Item
- **Endpoint:** `/carts/{id}`
- **Method:** `DELETE`
- **Description:** Deletes a specific cart item.
- **Parameters:** `id (Long)` - ID of the cart item.

### Dependencies
This controller depends on the `CartService` for performing operations on the cart. The `CartService` is injected into the controller via the constructor.

### Data Transfer Object
The `FakeStoreApi` class is used as a Data Transfer Object (DTO) for cart items. It represents the structure of the data that is sent and received in HTTP requests and responses.

## Product Service API

### Endpoints

#### Get All Products
- **Endpoint:** `/products`
- **Method:** `GET`
- **Description:** Fetches all products.
- **Response:** Array of FakeStoreApi objects.

#### Get Product
- **Endpoint:** `/products/{id}`
- **Method:** `GET`
- **Description:** Fetches a specific product by its ID.
- **Parameters:** `id (Long)` - ID of the product.
- **Response:** FakeStoreApi object.

#### Add Product
- **Endpoint:** `/products`
- **Method:** `POST`
- **Description:** Adds a new product.
- **Parameters:** FakeStoreApi object.
- **Response:** FakeStoreApi object.

#### Update Product
- **Endpoint:** `/products/{id}`
- **Method:** `PATCH`
- **Description:** Updates a specific product.
- **Parameters:** FakeStoreApi object.
- **Response:** FakeStoreApi object.

#### Delete Product
- **Endpoint:** `/products/{id}`
- **Method:** `DELETE`
- **Description:** Deletes a specific product.
- **Parameters:** `id (Long)` - ID of the product.

### Dependencies
This controller depends on the `ProductService` for performing operations on the products. The `ProductService` is injected into the controller via the constructor.

### Data Transfer Object
The `FakeStoreApi` class is used as a Data Transfer Object (DTO) for products. It represents the structure of the data that is sent and received in HTTP requests and responses.

