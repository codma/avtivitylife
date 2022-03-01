package com.simmariazi.avtivitylife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var nLineNumber = 0
    //Activity가 생성될
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ALLTEST", String.format("\n%d: onCreate", nLineNumber++))
    }

    //내 activity 맨 앞으로 왔을 때
    public override fun onResume(){
        super.onResume()
        Log.d("ALLTEST", String.format("%d: onResume", nLineNumber++))
    }

    //내 activity 맨 앞에 뭔가가 있을 때
    public override fun onStop(){
        super.onStop()
        Log.d("ALLTEST", String.format("%d: onStop", nLineNumber++))
    }

    //Activity가 최초 실행될 때
    public override fun onStart(){
        super.onStart()
        Log.d("ALLTEST", String.format("%d: onStart", nLineNumber++))
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.d("ALLTEST", String.format("%d: onDestroy", nLineNumber++))
    }

}

//다음과 같은 순서로 App을 실행 했을 때 Logcat 메시지
//App 실행 > 홈키 > 앱을 실행 > back 키를 눌러 앱 종료 > 앱을 실행

// beginning of system
//2022-03-01 21:57:08.749 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 0: onCreate
//2022-03-01 21:57:08.754 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 1: onStart
//2022-03-01 21:57:08.756 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 2: onResume

//beginning of crash
//2022-03-01 22:00:44.251 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 3: onStop
//2022-03-01 22:00:57.126 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 4: onStart
//2022-03-01 22:00:57.129 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 5: onResume
//2022-03-01 22:01:02.037 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 6: onStop
//2022-03-01 22:01:02.039 10073-10073/com.simmariazi.avtivitylife D/ALLTEST: 7: onDestroy

//2022-03-01 22:03:39.723 10225-10225/com.simmariazi.avtivitylife D/ALLTEST: 0: onCreate
//2022-03-01 22:03:39.732 10225-10225/com.simmariazi.avtivitylife D/ALLTEST: 1: onStart
//2022-03-01 22:03:39.734 10225-10225/com.simmariazi.avtivitylife D/ALLTEST: 2: onResume