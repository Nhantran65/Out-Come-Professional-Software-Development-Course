# React + TypeScript + Vite

This template comes with various features, including React, Redux-Toolkit, TypeScript, Vite, Jest, Antd, EsLint, and Prettier.

## Features

### React

A popular JavaScript library for building user interfaces. It allows developers to create reusable UI components and provides a declarative approach to rendering views.

### Redux-Toolkit

An opinionated, batteries-included package for efficient Redux development. It includes utilities for simplified Redux store setup, creating reducers and actions, and handling immutable updates.

### TypeScript

A superset of JavaScript that adds optional static type checking and other features to the language. It helps catch errors earlier in the development process and improves code readability and maintainability.

### Vite

A module bundler that allows developers to bundle and optimize their code for production. It supports a wide range of asset types, including JavaScript, CSS, and images, and provides powerful features for code splitting and lazy loading.

### Jest

A popular testing framework for JavaScript applications. It provides a simple and intuitive API for writing tests and supports a wide range of features, including mocking, code coverage, and snapshot testing.

### Antd

A UI design language and component library allowing developers to quickly create beautiful and functional user interfaces for web applications.

### EsLint

A popular linter for JavaScript that helps identify and fix syntax errors, coding style issues, and other common programming errors. It provides a wide range of customizable rules and integrates with many popular text editors and build tools.

### Prettier

An opinionated code formatter that helps ensure code consistency and readability across teams. It supports a wide range of languages and integrates with many popular text editors and build tools.

## Getting Started

Before you start, make sure you have a fresh version of [Node.js](https://nodejs.org/en/) and Yarn installed. The current Long Term Support (LTS) release is an ideal starting point.

1. Fork this repository and clone your own fork to your computer:

    ```sh
    git clone https://github.com/Nhantran65/booking-doctor-client
    ```

2. From the project's root directory, install the required packages (dependencies):

    ```sh
    yarn install
    ```

3. To run and test the app on your local machine (http://localhost:5173):

    ```sh
    yarn start:dev
    ```

    This will start a server instance and begin listening for connections in develop environment from localhost on port `5173`.

    ```sh
    yarn start:pro
    ```

    This will start a server instance and begin listening for connections in production environment from localhost on port `5173`.

4. To build/deploy the app, you can run:

    ```sh
    yarn build:dev
    ```

    This will place all files needed for deployment for develop server into the `/dist` directory.

    ```sh
    yarn build:pro
    ```

    This will place all files needed for deployment for production server into the `/dist` directory.
