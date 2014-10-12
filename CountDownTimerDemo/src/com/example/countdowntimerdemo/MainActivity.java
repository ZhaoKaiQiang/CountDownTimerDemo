package com.example.countdowntimerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.countdowntimerdemo.CountDownButtonHelper.OnFinishListener;

/**
 * 倒计时帮助类的测试Activity
 * 
 * @author zhaokaiqiang
 * 
 * @see http://blog.csdn.net/zhaokaiqiang1992
 */
public class MainActivity extends Activity {

	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				CountDownButtonHelper helper = new CountDownButtonHelper(btn,
						"发送验证码", 60, 1);
				helper.setOnFinishListener(new OnFinishListener() {

					@Override
					public void finish() {
						Toast.makeText(MainActivity.this, "倒计时结束",
								Toast.LENGTH_SHORT).show();
					}
				});
				helper.start();

			}
		});
	}

}
