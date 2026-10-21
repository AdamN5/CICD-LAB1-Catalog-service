# Catalog Service

Catalog service for CICD-1. It runs on port 8081 and saves products in an H2 database.

- GET /products/min-price?price=100 gets products that cost 100 or more.
- GET /products/by-category?name=Computers gets products in that category.
- POST /products needs a categoryId that already exists, like {"name": "Keyboard", "price": 79.99, "categoryId": 2}. If its missing or wrong you get a 400.
