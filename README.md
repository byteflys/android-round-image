# About this Project

An android ImageView that supports corners and border

# Core Ability

- support different corners
- support border color and width

# Steps for Integration

#### 1. Dependency

```kotlin
api("io.github.hellogoogle2000:android-round-image:1.0.1")
```

#### 2. Apply in Xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/gray"
    android:gravity="center"
    android:orientation="vertical">

    <com.android.library.roundimage.RoundImageView
        android:id="@+id/roundImageView"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:src="@drawable/ic"
        app:borderColor="@color/blue"
        app:borderWidth="2dp"
        app:showBorder="true"
        app:topLeftRadius="30dp"
        app:topRightRadius="30dp" />
</LinearLayout>
```

# Preview

<img src="https://github.com/user-attachments/assets/8aabc5a7-12b1-4d93-9421-33d511fa82f1" width="250"><br>