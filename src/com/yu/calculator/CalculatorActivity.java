package com.yu.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity {

	private String str = "";
	private EditText et_show;// 显示屏
	private int sign = 0, flag = 0;// sign符号 ,flag暂存
	private double num1 = 0.0, num2 = 0.0, result = 0.0;//
	private View vi;//控件

	// 计算方法
	public double calculater() {
		switch (sign) {
		case 0:
			result = num2;
			break; // 等于
		case 1:
			result = num1 + num2;
			break;// 加
		case 2:
			result = num1 - num2;
			break;// 减
		case 3:
			result = num1 * num2;
			break;// 乘
		case 4:
			result = num1 / num2;
			break;// 除

		}
		num1 = result;
		sign = 0;
		return result;
	}

	// 窗体内容
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		// 获得按键
		final Button number[] = new Button[10];// 数字
		final Button mark[] = new Button[11];// 符号
		mark[0] = (Button) findViewById(R.id.btnAdd);// 加
		mark[1] = (Button) findViewById(R.id.btnMinus);// 减
		mark[2] = (Button) findViewById(R.id.btnMultiply);// 乘
		mark[3] = (Button) findViewById(R.id.btnDivide);// 除
		mark[4] = (Button) findViewById(R.id.btnEqual);// 等于
		mark[5] = (Button) findViewById(R.id.btnPoint);// 小数点
		mark[6] = (Button) findViewById(R.id.btnClears);// 清屏
		mark[7] = (Button) findViewById(R.id.btnClearAll);// 全清
		mark[8] = (Button) findViewById(R.id.btnPlusOrMinus);// 正负
		mark[9] = (Button) findViewById(R.id.btnRadicals);// 开根号
		mark[10] = (Button) findViewById(R.id.btnSquare);// 平方

		number[0] = (Button) findViewById(R.id.btnZero);// 0
		number[1] = (Button) findViewById(R.id.btnOne);// 1
		number[2] = (Button) findViewById(R.id.btnTwo);// 2
		number[3] = (Button) findViewById(R.id.btnThree);// 3
		number[4] = (Button) findViewById(R.id.btnFour);// 4
		number[5] = (Button) findViewById(R.id.btnFive);// 5
		number[6] = (Button) findViewById(R.id.btnSix);// 6
		number[7] = (Button) findViewById(R.id.btnSeven);// 7
		number[8] = (Button) findViewById(R.id.btnEight);// 8
		number[9] = (Button) findViewById(R.id.btnNine);// 9

		et_show = (EditText) findViewById(R.id.et_show);// 显示框
		et_show.setKeyListener(null);// 设置文本为只读
		et_show.setText(str);// 赋值

		// 设定数字按键0
		number[0].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 0;
					et_show.setText(str);
					flag = 0;
				} else {
					char ch1[];
					ch1 = str.toCharArray();
					if (!(ch1.length == 1 && ch1[0] == '0')) {
						str += 0;
						et_show.setText(str);
					}

				}
				vi = v;
			}
		});
		// 设定数字按键1
		number[1].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 1;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 1;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键2
		number[2].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 2;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 2;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键3
		number[3].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 3;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 3;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键4
		number[4].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 4;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 4;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键5
		number[5].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 5;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 5;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键6
		number[6].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 6;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 6;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键7
		number[7].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 7;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 7;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键8
		number[8].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 8;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 8;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定数字按键9
		number[9].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (flag == 1) {
					str = "";
					str += 9;
					et_show.setText(str);
					flag = 0;
				} else {
					str += 9;
					et_show.setText(str);
				}
				vi = v;
			}
		});
		// 设定符号键
		//加
        mark[0].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(str!=""){
				if(vi==mark[0]||vi==mark[1]||vi==mark[2]||vi==mark[3]){
					sign=1;
				}else{
					num2=Double.parseDouble(str);
					calculater();
					str=""+result;
					et_show.setText(str);
					sign=1;
					flag=1;
					vi=v;
				}}
			}
		});

        //减
        mark[1].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(str!=""){
				if(vi==mark[0]||vi==mark[1]||vi==mark[2]||vi==mark[3]){
					sign=2;
				}else{
					num2=Double.parseDouble(str);
					calculater();
					str=""+result;
					et_show.setText(str);
					sign=2;
					flag=1;
					vi=v;
				}}
			}
		});

        //乘
        mark[2].setOnClickListener(new View.OnClickListener() {		
			public void onClick(View v) {
				if(str!=""){
				if(vi==mark[0]||vi==mark[1]||vi==mark[2]||vi==mark[3]){
					sign=3;
				}else{
					num2=Double.parseDouble(str);
					calculater();
					str=""+result;
					et_show.setText(str);
					sign=3;
					flag=1;
					vi=v;
				}}
			}
		});

        //除
        mark[3].setOnClickListener(new View.OnClickListener() {		
			public void onClick(View v) {
				if(str!=""){
				if(vi==mark[0]||vi==mark[1]||vi==mark[2]||vi==mark[3]){
					sign=4;
				}else{
					num2=Double.parseDouble(str);
					calculater();
					str=""+result;
					et_show.setText(str);
					sign=4;
					flag=1;
					vi=v;
				}}
			}
		});

        //等号        
        mark[4].setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				if(str!=""&&vi!=mark[0]&&vi!=mark[1]&&vi!=mark[2]&&vi!=mark[3]){
					num2=Double.parseDouble(str);
					calculater();
					str=""+result;
					et_show.setText(str);
					flag=1;
					vi=v;

				}
			}
		});
		// 等号
		mark[4].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (str != "" && vi != mark[0] && vi != mark[1] && vi != mark[2] && vi != mark[3]) {
					num2 = Double.parseDouble(str);
					calculater();
					str = "" + result;
					et_show.setText(str);
					flag = 1;
					vi = v;
				}
			}
		});
		// 小数点
		mark[5].setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (str == "") {
					str += ".";
					et_show.setText(str);
				} else {
					char ch1[];
					int x = 0;
					ch1 = str.toCharArray();
					for (int i = 0; i < ch1.length; i++)
						if (ch1[i] == '.')
							x++;
					if (x == 0) {
						str += ".";
						et_show.setText(str);
					}
				}

			}
		});
		//清屏
		mark[6].setOnClickListener(new View.OnClickListener() {	
				public void onClick(View v) {
					str="";
					et_show.setText(str);
					vi=v;
				}
			});
	    //全清
		mark[7].setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					num1=0.0;num2=0;result=0.0;
					str="";
					et_show.setText(str);

				}
			});
	    //正负
		mark[8].setOnClickListener(new View.OnClickListener() {		
				public void onClick(View v) {
					if(vi!=mark[5]&&str!=""){
						char ch=str.charAt(0);
						if(ch=='-')
							str=str.replace("-","");
						else
							str="-"+str;
						et_show.setText(str);
					}
				}
			});
	    //开方    
		mark[9].setOnClickListener(new View.OnClickListener() {		
				public void onClick(View v) {
					if(str!=""){
					double a=Double.parseDouble(str);
					str=Math.sqrt(a)+"";
					et_show.setText(str);
				}}
			});
	    //平方
		mark[10].setOnClickListener(new View.OnClickListener() {			
				public void onClick(View v) {
					if(str!=""){
					double a=Double.parseDouble(str);
					str=""+a*a;
					et_show.setText(str);
				}}
			});
	}

	// 菜单选项
	public boolean onCreateOptionsMenu1(Menu menu) {
		menu.add(0, 1, 1, "退出");
		return super.onCreateOptionsMenu(menu);
	}

	// 菜单事件
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 1) {
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
}
