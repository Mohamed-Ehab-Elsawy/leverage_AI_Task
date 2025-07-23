# Leverage AI Task - Android (Jetpack Compose)

This project is a demo food application built with **Android (Kotlin)** and **Jetpack Compose**, following the MVVM architecture. The task was to reproduce a given UI screen and demonstrate **AI-assisted development** using ProxyAI plugin.

---

## 📱 Final Result (Side-by-Side Comparison)

| Design Reference | My Implementation |
| ---------------- | ----------------- |
|                  |                   |

---

## 🤖 ProxyAI Prompts & Integration

### ✅ Prompt 1: Data Classes for Product and Category

**Prompt:**\
`This is a food application, the main screen contains the food cards and the head view is tabs for food category. Generate 2 data classes: Product (food name, price, urlImage) and Category.`

**Response:**

```kotlin
data class Product(
    val foodName: String,
    val price: Double,
    val urlImage: String
)

data class Category(
    val id: Int,
    val name: String
)
```

🔗 **Used In:** `model/Product.kt`, `model/Category.kt`

---

### ✅ Prompt 2: Generate mock data

**Prompt:**\
`Generate mockData object for Product class with at least 10 variables.`

**Response Snippet:**

```kotlin
object MockData {
    val products = listOf(
        Product("Margherita Pizza", 8.99, "https://example.com/images/margherita_pizza.jpg"),
        ...
    )
}
```

🔗 **Used In:** `data/MockData.kt`

---

### ✅ Prompt 3: ViewModel using mock data

**Prompt:**\
`Generate the viewModel using the mockData.`

**Response:**

```kotlin
class ProductsViewModel : ViewModel() {
    private val _products = MutableLiveData<List<Product>>().apply {
        value = MockData.products
    }
    val products: LiveData<List<Product>> = _products
}
```

🔗 **Used In:** `viewmodel/ProductsViewModel.kt`

---

## 🧪 How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/YOUR_USERNAME/leverage-ai-task.git
   ```

2. Open in **Android Studio Hedgehog** or newer.

3. Ensure Compose & Kotlin versions:

   - Kotlin: `1.9.10`
   - Compose Compiler: `1.5.3`
   - Coil: `2.4.0`

4. Run the app on an emulator or physical device (API 24+).

---

## 🏗️ Project Structure

```
├── data/           # Mock data object
├── model/          # Data classes for Product and Category
├── ui/
│   ├── screen/     # Main food listing screen
│   └── components/ # Reusable composables
├── viewmodel/      # ProductsViewModel
├── MainActivity.kt
```

---

## 💡 Features

- ✅ Food list displayed using Compose `LazyColumn`
- ✅ Top tab row for categories
- ✅ Coil image loading for product images
- ✅ Toast message on item click
- ✅ Back navigation
- ✅ Fully responsive layout and mock data

---

## 📦 Dependencies

- Jetpack Compose (Material 1.5.3)
- Coil (2.4.0)
- LiveData + ViewModel (MVVM)
- ProxyAI plugin for AI-assisted development

---

## 🎥 Task Submission

- **Track:** Android (Jetpack Compose)
- **GitHub:** [👉 View the Repository](https://github.com/YOUR_USERNAME/leverage-ai-task)
- **Video Demo:** [🎨 Watch here](https://link-to-your-video.com)

---

## 👨‍💻 Author

**Mohamed Ehab**\
Computer Science Student - New Cairo Academy\
[LinkedIn](https://linkedin.com/in/YOUR_LINK) | [Email](mailto\:YOUR_EMAIL)

