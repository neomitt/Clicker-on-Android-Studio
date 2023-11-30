# Clicker-on-Android-Studio
This clicker on Android Studio

![Screenshot](https://github.com/neomitt/Clicker-on-Android-Studio/blob/main/screnshot1.png)

## Interface
![Screenshot](https://github.com/neomitt/Clicker-on-Android-Studio/blob/main/screnshot3.png)
## Code fragment
```java
    public void onClick(View v){
        TextView textView = findViewById(R.id.textView);

        if(clickx == 0){
            click++;
            textView.setText("Clicks " + click);
        }
        else if(clickx == 10){
            click += 10;
            textView.setText("Clicks " + click);
        }
        else if(clickx == 100){
            click += 100;
            textView.setText("Clicks " + click);
        }
        else if(clickx == 1000){
            click += 1000;
            textView.setText("Clicks " + click);
        }
    }
```
### [Github teachers: gomarmadi](https://github.com/gomarmadi)
