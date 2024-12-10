# Android Services

An **Android Service** is a component that performs long-running operations in the background without a user interface. Services are useful for tasks like playing music, downloading files, or running periodic tasks.

## Types of Services

1. **Foreground Service**  
   A service that performs a task visible to the user. It shows a persistent notification.  
   Example: Music player, location tracking apps.

2. **Background Service**  
   Runs tasks in the background without user interaction. As of Android 8.0 (Oreo), background execution limitations apply.  
   Example: Syncing data or performing lightweight background tasks.

3. **Bound Service**  
   Allows components (like activities) to bind to it and interact via IPC (Inter-Process Communication).  
   Example: Fetching real-time data for an activity.

---

## How to Create a Service

### 1. Extend the `Service` Class

```kotlin
class MyService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        // Return null if it's not a bound service
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Perform your background task here
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        // Cleanup resources here
    }
}
