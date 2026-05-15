# WellnessGPT - NutriGenie AI

An AI-powered wellness assistant built with **Spring Boot** and **Spring AI** that leverages Large Language Models (LLMs) to provide personalized health and fitness guidance.

## 🌟 Features

- **Recipe Analysis**: Analyze recipes and get nutritional insights using AI
- **Personalized Diet Plans**: Generate customized diet plans tailored to individual preferences and health goals
- **Workout Plan Generation**: Create personalized workout routines based on fitness level and objectives
- **Meal Comparison**: Compare different meals and get nutritional recommendations
- **Exercise Recommendations**: Receive AI-powered exercise suggestions and guidance
- **Structured AI Responses**: Leverages prompt templates and LLMs for consistent, high-quality responses

## 🛠️ Technology Stack

- **Backend Framework**: Spring Boot
- **AI Integration**: Spring AI
- **Language Models**: LLMs with prompt templating
- **Primary Language**: Java (78.8%) | Smalltalk (21.2%)

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher
- Spring Boot 2.x or 3.x
- Maven or Gradle
- API key for your chosen LLM provider

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/RoshanChongder/WellnessGPT.git
   cd WellnessGPT
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Configure API Keys**
   - Set up your LLM provider credentials in `application.properties` or `application.yml`

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

## 📚 Usage

### Recipe Analysis
```java
// Analyze a recipe and get nutritional insights
RecipeAnalyzer analyzer = new RecipeAnalyzer();
RecipeInsights insights = analyzer.analyzeRecipe("Your recipe text");
```

### Generate Diet Plan
```java
// Generate a personalized diet plan
DietPlanGenerator generator = new DietPlanGenerator();
DietPlan plan = generator.generatePlan(userProfile, nutritionalGoals);
```

### Create Workout Plan
```java
// Create a personalized workout routine
WorkoutPlanner planner = new WorkoutPlanner();
WorkoutPlan workout = planner.createPlan(fitnessLevel, goals);
```

### Compare Meals
```java
// Compare nutritional values of different meals
MealComparator comparator = new MealComparator();
ComparisonResult result = comparator.compareMeals(meal1, meal2);
```

## 📋 API Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/recipes/analyze` | POST | Analyze a recipe |
| `/api/diet-plans/generate` | POST | Generate a diet plan |
| `/api/workouts/generate` | POST | Generate a workout plan |
| `/api/meals/compare` | POST | Compare meals |
| `/api/exercises/recommend` | POST | Get exercise recommendations |

## 🏗️ Project Structure

```
WellnessGPT/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/wellnessgpt/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── model/
│   │   │       └── util/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── prompts/
│   └── test/
├── pom.xml
└── README.md
```

## 🔐 Configuration

### Application Properties

```properties
# LLM Configuration
spring.ai.openai.api-key=your-api-key
spring.ai.openai.model=gpt-4

# Server Configuration
server.port=8080
server.servlet.context-path=/api/v1
```

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is currently unlicensed. For licensing information, please contact the repository owner.

## 👨‍💻 Author

**RoshanChongder**
- GitHub: [@RoshanChongder](https://github.com/RoshanChongder)

## 📧 Support

For support, please open an issue on the [GitHub Issues](https://github.com/RoshanChongder/WellnessGPT/issues) page.

## 🙏 Acknowledgments

- Spring Boot and Spring AI communities
- All contributors and users of WellnessGPT

---

**Last Updated**: May 15, 2026

*WellnessGPT - Your AI-powered wellness companion*
