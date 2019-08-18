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
	private EditText et_show;// ��ʾ��
	private int sign = 0, flag = 0;// sign���� ,flag�ݴ�
	private double num1 = 0.0, num2 = 0.0, result = 0.0;//
	private View vi;//�ؼ�

	// ���㷽��
	public double calculater() {
		switch (sign) {
		case 0:
			result = num2;
			break; // ����
		case 1:
			result = num1 + num2;
			break;// ��
		case 2:
			result = num1 - num2;
			break;// ��
		case 3:
			result = num1 * num2;
			break;// ��
		case 4:
			result = num1 / num2;
			break;// ��

		}
		num1 = result;
		sign = 0;
		return result;
	}

	// ��������
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		// ��ð���
		final Button number[] = new Button[10];// ����
		final Button mark[] = new Button[11];// ����
		mark[0] = (Button) findViewById(R.id.btnAdd);// ��
		mark[1] = (Button) findViewById(R.id.btnMinus);// ��
		mark[2] = (Button) findViewById(R.id.btnMultiply);// ��
		mark[3] = (Button) findViewById(R.id.btnDivide);// ��
		mark[4] = (Button) findViewById(R.id.btnEqual);// ����
		mark[5] = (Button) findViewById(R.id.btnPoint);// С����
		mark[6] = (Button) findViewById(R.id.btnClears);// ����
		mark[7] = (Button) findViewById(R.id.btnClearAll);// ȫ��
		mark[8] = (Button) findViewById(R.id.btnPlusOrMinus);// ����
		mark[9] = (Button) findViewById(R.id.btnRadicals);// ������
		mark[10] = (Button) findViewById(R.id.btnSquare);// ƽ��

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

		et_show = (EditText) findViewById(R.id.et_show);// ��ʾ��
		et_show.setKeyListener(null);// �����ı�Ϊֻ��
		et_show.setText(str);// ��ֵ

		// �趨���ְ���0
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
		// �趨���ְ���1
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
		// �趨���ְ���2
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
		// �趨���ְ���3
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
		// �趨���ְ���4
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
		// �趨���ְ���5
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
		// �趨���ְ���6
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
		// �趨���ְ���7
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
		// �趨���ְ���8
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
		// �趨���ְ���9
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
		// �趨���ż�
		//��
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

        //��
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

        //��
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

        //��
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

        //�Ⱥ�        
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
		// �Ⱥ�
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
		// С����
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
		//����
		mark[6].setOnClickListener(new View.OnClickListener() {	
				public void onClick(View v) {
					str="";
					et_show.setText(str);
					vi=v;
				}
			});
	    //ȫ��
		mark[7].setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					num1=0.0;num2=0;result=0.0;
					str="";
					et_show.setText(str);

				}
			});
	    //����
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
	    //����    
		mark[9].setOnClickListener(new View.OnClickListener() {		
				public void onClick(View v) {
					if(str!=""){
					double a=Double.parseDouble(str);
					str=Math.sqrt(a)+"";
					et_show.setText(str);
				}}
			});
	    //ƽ��
		mark[10].setOnClickListener(new View.OnClickListener() {			
				public void onClick(View v) {
					if(str!=""){
					double a=Double.parseDouble(str);
					str=""+a*a;
					et_show.setText(str);
				}}
			});
	}

	// �˵�ѡ��
	public boolean onCreateOptionsMenu1(Menu menu) {
		menu.add(0, 1, 1, "�˳�");
		return super.onCreateOptionsMenu(menu);
	}

	// �˵��¼�
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 1) {
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
}
