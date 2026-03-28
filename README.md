# 💳 Spring IoC – Payment Example

A simple project demonstrating **Spring IoC (Inversion of Control)** using a real-world **Payment System**.

---
## 🚀 Concept

The application supports multiple payment methods:

* UPI
* Card
* Cash

Using Spring IoC, the payment method can be changed **without modifying Java code**.

---

## 🧩 Structure

```plaintext id="3k8d1n"
PaymentService (interface)
 ├── UpiPayment
 ├── CardPayment
 ├── CashPayment
PaymentApp
```

---

## 📊 Architecture

![Spring IoC Diagram](spring_ioc.png)

---

## ▶️ Output

```plaintext id="z9x2lm"
Paid $5000 using UPI
```

---
## 📌 Conclusion

👉 *Spring IoC manages object creation and allows easy switching between implementations, making the application flexible and maintainable.*
