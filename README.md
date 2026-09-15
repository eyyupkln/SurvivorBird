# 🐦 Survivor Bird

A fun and engaging 2D bird survival game built with **LibGDX** and **Java**. Navigate your bird through obstacles and survive as long as possible!

**Languages:** [🇹🇷 Türkçe](#türkçe) | [🇺🇸 English](#english)

---

## English

### 📋 Overview

Survivor Bird is a cross-platform mobile game developed using the LibGDX framework. The game challenges players to guide a bird through an endless stream of obstacles while managing physics-based gravity and collision mechanics. It features copyright-free background music and simple yet engaging gameplay mechanics.

### ✨ Features

- **Physics-Based Gameplay**: Realistic gravity and velocity simulation
- **Collision Detection**: Advanced circle-based collision system
- **Multiple Game States**: Menu, gameplay, and game over screens
- **Score System**: Track your survival distance in real-time
- **Audio**: Copyright-free background music for immersive gameplay
- **Cross-Platform**: Runs on both Android and desktop platforms
- **Responsive Design**: Adapts to different screen sizes
- **Infinite Obstacles**: Randomly generated enemy patterns for replay value

### 🎮 How to Play

1. **Start**: Tap the screen to begin the game
2. **Control**: Tap anywhere on the screen to make the bird jump
3. **Survive**: Avoid the incoming bees by timing your jumps correctly
4. **Score**: Earn points by successfully dodging each set of obstacles
5. **Game Over**: Collision with bees ends the game
6. **Retry**: Tap to play again and beat your high score

### 🛠️ Technology Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Core game logic and implementation |
| **LibGDX** | Game framework for cross-platform development |
| **Gradle** | Build automation and dependency management |
| **Android SDK** | Mobile platform support |

### 📦 Project Structure

```
SurvivorBird/
├── core/                          # Core game logic (platform-independent)
│   ├── src/main/java/
│   │   └── com/example/survivorbird/
│   │       └── SurvivorBird.java   # Main game class
│   └── build.gradle
├── android/                       # Android-specific implementation
│   ├── src/
│   ├── res/
│   ├── AndroidManifest.xml
│   └── build.gradle
├── assets/                        # Game assets
│   ├── bird.png                   # Bird sprite
│   ├── bee.png                    # Bee obstacle sprite
│   ├── tree.png                   # Background tree sprite
│   ├── background.png             # Background image
│   └── music.mp3                  # Background music
├── build.gradle                   # Root build configuration
├── settings.gradle
├── gradle.properties
└── README.md

```

### 🚀 Getting Started

#### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Android SDK** (for Android builds)
- **Gradle** 7.0+ (or use included gradle wrapper)
- **IDE** (Android Studio, IntelliJ IDEA, or Eclipse)

#### Installation & Building

1. **Clone the Repository**
   ```bash
   git clone https://github.com/eyyupkln/SurvivorBird.git
   cd SurvivorBird
   ```

2. **Build the Project**
   ```bash
   # Using Gradle wrapper (Linux/Mac)
   ./gradlew build

   # Using Gradle wrapper (Windows)
   gradlew.bat build
   ```

3. **Run on Desktop**
   ```bash
   ./gradlew desktop:run
   ```

4. **Build for Android**
   ```bash
   ./gradlew android:build
   ```

5. **Deploy to Android Device**
   ```bash
   ./gradlew android:installDebug
   ```

### 🎮 Game Mechanics

#### Physics System
- **Gravity**: Constant downward acceleration (1.1 units/frame)
- **Velocity**: Applied when player taps, resets on collision
- **Collision**: Circle-based detection using LibGDX's Intersector

#### Game States
```
START → PLAYING → GAME OVER → RESTART
  ↑                                ↓
  ←──────────────────────────────←
```

#### Scoring
- Points awarded for successfully avoiding each obstacle set
- Score displayed in real-time
- Resets on collision

### 📱 Platform Support

- ✅ **Android**: API Level 21+
- ✅ **Desktop (Windows, Mac, Linux)**
- ✅ **Web** (with additional configuration)

### 🔧 Building Details

#### Core Dependencies
- LibGDX Framework
- Android Gradle Plugin 8.9.3

#### Asset Pipeline
- Automatic asset list generation during build
- Assets located in `/assets` directory
- Compiled into platform-specific packages

### 🐛 Known Limitations

- Currently supports up to 4 simultaneous obstacle lanes
- Fixed screen resolution; adapts to device sizes
- No pause functionality in current version

### 🚧 Future Enhancements

- [ ] Pause and resume functionality
- [ ] Difficulty levels (Easy, Normal, Hard)
- [ ] Power-ups (shield, speed boost, slow motion)
- [ ] Leaderboard with cloud sync
- [ ] Sound effects for collisions and scoring
- [ ] Multiple bird skins/themes
- [ ] Particle effects on collision
- [ ] Tutorial screens for new players

### 📧 Contact & Support

**Developer**: Eyyüp Kalan  
**Email**: [eyyupkalan1604@gmail.com]  
**GitHub**: [@eyyupkln](https://github.com/eyyupkln)

### 📄 License

This project uses copyright-free assets and music.

---

## Türkçe

### 📋 Genel Bakış

Survivor Bird, LibGDX framework kullanılarak Java ile geliştirilen çapraz platform mobil oyunudur. Oyun, oyunculara bir kuşu engellerin sonsuz akışı arasında yönlendirmeyi ve fizik tabanlı yerçekimi ve çarpışma mekaniklerini yönetmeyi zorlayan bir oyundur. Telif hakkı içermeyen arka plan müziği ve basit ancak ilgi çekici oyun mekaniklerine sahiptir.

### ✨ Özellikler

- **Fizik Tabanlı Oyun Mekaniği**: Gerçekçi yerçekimi ve hız simülasyonu
- **Çarpışma Algılaması**: Gelişmiş daire tabanlı çarpışma sistemi
- **Çoklu Oyun Durumları**: Menü, oynanış ve oyun sonu ekranları
- **Puan Sistemi**: Gerçek zamanlı hayatta kalma mesafesini takip et
- **Ses**: Sürükleyici oynanış için telif hakkı içermeyen arka plan müziği
- **Çapraz Platform**: Hem Android hem de masaüstü platformlarında çalışır
- **Duyarlı Tasarım**: Farklı ekran boyutlarına uyum sağlar
- **Sonsuz Engeller**: Oynanabilirlik için rastgele üretilen düşman desenleri

### 🎮 Nasıl Oynanır

1. **Başla**: Oyunu başlatmak için ekrana dokunun
2. **Kontrol**: Kuşu zıplamak için ekranda herhangi bir yere dokunun
3. **Hayatta Kal**: Atlayışlarınızı zamanlamasını yaparak gelen arılardan kaçının
4. **Puan Kazan**: Her engel setinden başarıyla kaçarak puan kazanın
5. **Oyun Bitti**: Arılarla çarpışma oyunu sonlandırır
6. **Yeniden Deneyin**: Dokunarak tekrar oynayın ve en yüksek puanınızı yenin

### 🛠️ Teknoloji Stack'i

| Teknoloji | Amaç |
|-----------|------|
| **Java** | Temel oyun mantığı ve uygulaması |
| **LibGDX** | Çapraz platform geliştirme için oyun framework'ü |
| **Gradle** | Derleme otomasyonu ve bağımlılık yönetimi |
| **Android SDK** | Mobil platform desteği |

### 📦 Proje Yapısı

```
SurvivorBird/
├── core/                          # Temel oyun mantığı (platform bağımsız)
│   ├── src/main/java/
│   │   └── com/example/survivorbird/
│   │       └── SurvivorBird.java   # Ana oyun sınıfı
│   └── build.gradle
├── android/                       # Android'e özel uygulama
│   ├── src/
│   ├── res/
│   ├── AndroidManifest.xml
│   └── build.gradle
├── assets/                        # Oyun varlıkları
│   ├── bird.png                   # Kuş sprite'ı
│   ├── bee.png                    # Arı engeli sprite'ı
│   ├── tree.png                   # Arka plan ağacı sprite'ı
│   ├── background.png             # Arka plan resmi
│   └── music.mp3                  # Arka plan müziği
├── build.gradle                   # Kök derleme yapılandırması
├── settings.gradle
├── gradle.properties
└── README.md

```

### 🚀 Başlangıç Rehberi

#### Ön Koşullar

- **Java Development Kit (JDK)** 8 veya üstü
- **Android SDK** (Android derlemeleri için)
- **Gradle** 7.0+ (veya dahil edilen gradle wrapper'ı kullanın)
- **IDE** (Android Studio, IntelliJ IDEA veya Eclipse)

#### Kurulum & Derleme

1. **Depoyu Klonlayın**
   ```bash
   git clone https://github.com/eyyupkln/SurvivorBird.git
   cd SurvivorBird
   ```

2. **Projeyi Derleyin**
   ```bash
   # Gradle wrapper'ı kullanarak (Linux/Mac)
   ./gradlew build

   # Gradle wrapper'ı kullanarak (Windows)
   gradlew.bat build
   ```

3. **Masaüstünde Çalıştırın**
   ```bash
   ./gradlew desktop:run
   ```

4. **Android için Derleyin**
   ```bash
   ./gradlew android:build
   ```

5. **Android Cihazına Yükleyin**
   ```bash
   ./gradlew android:installDebug
   ```

### 🎮 Oyun Mekanikleri

#### Fizik Sistemi
- **Yerçekimi**: Sabit aşağı doğru hızlanma (1.1 birim/çerçeve)
- **Hız**: Oyuncu dokunduğunda uygulanır, çarpışmada sıfırlanır
- **Çarpışma**: LibGDX'in Intersector'ünü kullanan daire tabanlı algılama

#### Oyun Durumları
```
BAŞLA → OYNAN → OYUN BİTTİ → YENIDEN BAŞLA
  ↑                              ↓
  ←──────────────────────────────←
```

#### Puanlama
- Her engel setinden başarıyla kaçmak için puan verilir
- Puan gerçek zamanlı gösterilir
- Çarpışmada sıfırlanır

### 📱 Platform Desteği

- ✅ **Android**: API Level 21+
- ✅ **Masaüstü (Windows, Mac, Linux)**
- ✅ **Web** (ek konfigürasyon ile)

### 🔧 Derleme Detayları

#### Temel Bağımlılıklar
- LibGDX Framework'ü
- Android Gradle Plugin 8.9.3

#### Varlık Pipeline'ı
- Derleme sırasında otomatik varlık listesi oluşturma
- Varlıklar `/assets` dizininde bulunur
- Platform'a özel paketlere derlenmiştir

### 🐛 Bilinen Sınırlamalar

- Şu anda 4'e kadar eşzamanlı engel şeritini destekler
- Sabit ekran çözünürlüğü; cihaz boyutlarına uyum sağlar
- Mevcut sürümde duraklatma işlevi yok

### 🚧 Gelecekteki İyileştirmeler

- [ ] Duraklatma ve devam ettirme işlevi
- [ ] Zorluk seviyeleri (Kolay, Normal, Zor)
- [ ] Power-ups (kalkan, hız artışı, yavaş çekim)
- [ ] Bulut senkronizasyonlu puan tablosu
- [ ] Çarpışma ve puanlama için ses efektleri
- [ ] Çoklu kuş gömlekleri/temalar
- [ ] Çarpışma sırasında parçacık efektleri
- [ ] Yeni oyuncular için öğretici ekranlar

### 📧 İletişim & Destek

**Geliştirici**: Eyyüp Kalan  
**E-posta**: [eyyupkalan1604@gmail.com]  
**GitHub**: [@eyyupkln](https://github.com/eyyupkln)

### 📄 Lisans

Bu proje telif hakkı içermeyen varlıklar ve müzik kullanır.

---

**Made with ❤️ by Eyyüp Kalan**
