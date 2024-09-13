//1. Класс "Человек"
//
//class Person {
//    private String name;
//    private int age;
//    private String gender;
//
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public void printInfo() {
//        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
//    }
//
//    public void increaseAge() {
//        age++;
//    }
//
//    public void changeName(String newName) {
//        this.name = newName;
//    }
//}
//
//2. Наследование: Класс "Работник" и "Менеджер"
//
//class Worker extends Person {
//    private double salary;
//
//    public Worker(String name, int age, String gender, double salary) {
//        super(name, age, gender);
//        this.salary = salary;
//    }
//
//    public void printInfo() {
//        super.printInfo();
//        System.out.println("Salary: " + salary);
//    }
//}
//
//class Manager extends Worker {
//    private String[] subordinates;
//
//    public Manager(String name, int age, String gender, double salary, String[] subordinates) {
//        super(name, age, gender, salary);
//        this.subordinates = subordinates;
//    }
//
//    public void printSubordinates() {
//        System.out.println("Subordinates: ");
//        for (String subordinate : subordinates) {
//            System.out.println(subordinate);
//        }
//    }
//}
//
//3. Полиморфизм: Животные
//
//interface Animal {
//    void makeSound();
//}
//
//class Dog implements Animal {
//    public void makeSound() {
//        System.out.println("Bark");
//    }
//}
//
//class Cat implements Animal {
//    public void makeSound() {
//        System.out.println("Meow");
//    }
//}
//
//class Cow implements Animal {
//    public void makeSound() {
//        System.out.println("Moo");
//    }
//}
//
//public class AnimalTest {
//    public static void main(String[] args) {
//        Animal[] animals = {new Dog(), new Cat(), new Cow()};
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
//    }
//}
//
//4. Абстрактный класс "Транспорт"
//
//abstract class Transport {
//    abstract void move();
//}
//
//class Car extends Transport {
//    public void move() {
//        System.out.println("The car drives");
//    }
//}
//
//class Bike extends Transport {
//    public void move() {
//        System.out.println("The bike pedals");
//    }
//}
//
//5. Класс "Книга" и "Библиотека"
//
//class Book {
//    private String title;
//    private String author;
//    private int year;
//
//    public Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//}
//
//import java.util.ArrayList;
//
//class Library {
//    private ArrayList<Book> books = new ArrayList<>();
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public ArrayList<Book> searchByAuthor(String author) {
//        ArrayList<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getAuthor().equalsIgnoreCase(author)) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<Book> searchByYear(int year) {
//        ArrayList<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getYear() == year) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//}
//
//6. Инкапсуляция: Банк
//
//class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//
//    public boolean withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            return true;
//        }
//        return false;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}
//
//7. Счетчик объектов
//
//class Counter {
//    private static int count = 0;
//
//    public Counter() {
//        count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//}
//
//8. Площадь фигур
//
//abstract class Shape {
//    abstract double getArea();
//}
//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    private double width, height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public double getArea() {
//        return width * height;
//    }
//}
//
//9. Наследование: Животные и их движения
//
//class Animal {
//    public void move() {
//        System.out.println("The animal moves");
//    }
//}
//
//class Fish extends Animal {
//    @Override
//    public void move() {
//        System.out.println("The fish swims");
//    }
//}
//
//class Bird extends Animal {
//    @Override
//    public void move() {
//        System.out.println("The bird flies");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    public void move() {
//        System.out.println("The dog runs");
//    }
//}
//
//10. Работа с коллекциями: Университет
//
//class Student {
//    private String name;
//    private String group;
//    private double grade;
//
//    public Student(String name, String group, double grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//}
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class University {
//    private ArrayList<Student> students = new ArrayList<>();
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void sortByName() {
//        Collections.sort(students, Comparator.comparing(Student::getName));
//    }
//
//    public ArrayList<Student> filterByGrade(double threshold) {
//        ArrayList<Student> result = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getGrade() >= threshold) {
//                result.add(student);
//            }
//        }
//        return result;
//    }
//}
//
//11. Класс "Магазин"
//
//class Product {
//    private String name;
//    private double price;
//    private int quantity;
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//}
//
//import java.util.ArrayList;
//
//class Store {
//    private ArrayList<Product> products = new ArrayList<>();
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(String name) {
//        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
//    }
//
//    public Product findProductByName(String name) {
//        for (Product product : products) {
//            if (product.getName().equalsIgnoreCase(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//}
//
//12. Интерфейс "Платежная система"
//
//interface PaymentSystem {
//    void pay(double amount);
//    void refund(double amount);
//}
//
//class CreditCard implements PaymentSystem {
//    public void pay(double amount) {
//        System.out.println("Paid " + amount + " using Credit Card");
//    }
//
//    public void refund(double amount) {
//        System.out.println("Refunded " + amount + " to Credit Card");
//    }
//}
//
//class PayPal implements PaymentSystem {
//    public void pay(double amount) {
//        System.out.println("Paid " + amount + " using PayPal");
//    }
//
//    public void refund(double amount) {
//        System.out.println("Refunded " + amount + " to PayPal");
//    }
//}
//
//13. Генерация уникальных идентификаторов
//
//class UniqueID {
//    private static int idCounter = 0;
//    private int id;
//
//    public UniqueID() {
//        this.id = generateID();
//    }
//
//    private static synchronized int generateID() {
//        return idCounter++;
//    }
//
//    public int getID() {
//        return id;
//    }
//}
//
//14. Класс "Точка" и "Прямоугольник"
//
//class Point {
//    private int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//}
//
//class Rectangle {
//    private Point topLeft;
//    private Point bottomRight;
//
//    public Rectangle(Point topLeft, Point bottomRight) {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//
//    public double getArea() {
//        int width = bottomRight.getX() - topLeft.getX();
//        int height = bottomRight.getY() - topLeft.getY();
//        return width * height;
//    }
//}
//
//15. Комплексные числа
//
//class ComplexNumber {
//    private double real;
//    private double imaginary;
//
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    public ComplexNumber add(ComplexNumber other) {
//        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//    }
//
//    public ComplexNumber subtract(ComplexNumber other) {
//        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//    }
//
//    public ComplexNumber multiply(ComplexNumber other) {
//        double realPart = this.real * other.real - this.imaginary * other.imaginary;
//        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    public ComplexNumber divide(ComplexNumber other) {
//        double divisor = other.real * other.real + other.imaginary * other.imaginary;
//        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
//        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    @Override
//    public String toString() {
//        return real + " + " + imaginary + "i";
//    }
//}
//
//16. Перегрузка операторов: Матрица
//
//class Matrix {
//    private int[][] matrix;
//
//    public Matrix(int[][] matrix) {
//        this.matrix = matrix;
//    }
//
//    public Matrix add(Matrix other) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int[][] result = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
//            }
//        }
//        return new Matrix(result);
//    }
//
//    public Matrix multiply(Matrix other) {
//        int rows = this.matrix.length;
//        int cols = other.matrix[0].length;
//        int[][] result = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result[i][j] = 0;
//                for (int k = 0; k < this.matrix[0].length; k++) {
//                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
//                }
//            }
//        }
//        return new Matrix(result);
//    }
//}
//
//17. Создание игры с использованием ООП
//
//class Player {
//    private String name;
//    private int health;
//    private Weapon weapon;
//
//    public Player(String name, Weapon weapon) {
//        this.name = name;
//        this.health = 100;
//        this.weapon = weapon;
//    }
//
//    public void attack(Enemy enemy) {
//        enemy.takeDamage(weapon.getDamage());
//    }
//}
//
//class Enemy {
//    private int health;
//
//    public Enemy() {
//        this.health = 50;
//    }
//
//    public void takeDamage(int damage) {
//        this.health -= damage;
//    }
//
//    public boolean isAlive() {
//        return health > 0;
//    }
//}
//
//class Weapon {
//    private String name;
//    private int damage;
//
//    public Weapon(String name, int damage) {
//        this.name = name;
//        this.damage = damage;
//    }
//
//    public int getDamage() {
//        return damage;
//    }
//}
//
//18. Автоматизированная система заказов
//
//class Product {
//    private String name;
//    private double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Order {
//    private ArrayList<Product> products = new ArrayList<>();
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public double getTotalPrice() {
//        double total = 0;
//        for (Product product : products) {
//            total += product.getPrice();
//        }
//        return total;
//    }
//}
//
//class Customer {
//    private String name;
//    private ArrayList<Order> orderHistory = new ArrayList<>();
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public void addOrder(Order order) {
//        orderHistory.add(order);
//    }
//
//    public ArrayList<Order> getOrderHistory() {
//        return orderHistory;
//    }
//}
//
//19. Наследование: Электроника
//
//class Device {
//    private String brand;
//
//    public Device(String brand) {
//        this.brand = brand;
//    }
//
//    public void turnOn() {
//        System.out.println(brand + " is now ON.");
//    }
//
//    public void turnOff() {
//        System.out.println(brand + " is now OFF.");
//    }
//}
//
//class Smartphone extends Device {
//    public Smartphone(String brand) {
//        super(brand);
//    }
//
//    public void takePhoto() {
//        System.out.println("Photo taken with smartphone");
//    }
//}
//
//class Laptop extends Device {
//    public Laptop(String brand) {
//        super(brand);
//    }
//
//    public void compileCode() {
//        System.out.println("Code compiled on laptop");
//    }
//}
//
//20. Игра "Крестики-нолики"
//
//class Game {
//    private char[][] board = new char[3][3];
//    private char currentPlayer;
//
//    public Game() {
//        currentPlayer = 'X';
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                board[i][j] = '-';
//            }
//        }
//    }
//
//    public void makeMove(int row, int col) {
//        if (board[row][col] == '-') {
//            board[row][col] = currentPlayer;
//            if (currentPlayer == 'X') {
//                currentPlayer = 'O';
//            } else {
//                currentPlayer = 'X';
//            }
//        }
//    }
//
//    public boolean checkWinner() {
//        for (int i = 0; i < 3; i++) {
//            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
//                return true;
//