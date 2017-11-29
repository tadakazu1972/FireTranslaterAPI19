package tadakazu1972.firetranslater;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class SyobyosyaActivity extends AppCompatActivity {
    protected SyobyosyaActivity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mText2 = null;
    private TextView mText3 = null;
    private TextView mTextResult0 = null;
    private TextView mTextResult = null;
    //ボタン
    private Button mButton1 = null;
    private Button mButton2 = null;
    private Button mButton3 = null;
    private Button mButton4 = null;
    private Button mButton5 = null;
    private Button mButton6 = null;
    private Button mButton7 = null;
    private Button mButton8 = null;
    private Button mButton9 = null;
    private Button mButton10 = null;
    private Button mButton11 = null;
    private Button mButton12 = null;
    //電卓数字格納用
    String mNum = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.syobyosya1);
        //選択言語番号を呼び出し
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        mLangNum = sp.getString("language","1"); // 第２引数はkeyが存在しない時に返す初期値
        //電卓数字格納変数初期化
        mNum = "";
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.s10);
        String nameText1 = "s10" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //text2
        mText2 = (TextView)findViewById(R.id.s11);
        String nameText2 = "s11" + mLangNum;
        int resourceIdText2 = getResources().getIdentifier(nameText2, "string", getPackageName());
        mText2.setText(resourceIdText2);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText2.setTextColor(Color.WHITE);
            mText2.setBackgroundResource(R.drawable.frame2);
        }
        //text3
        mText3 = (TextView)findViewById(R.id.s12);
        String nameText3 = "s12" + mLangNum;
        int resourceIdText3 = getResources().getIdentifier(nameText3, "string", getPackageName());
        mText3.setText(resourceIdText3);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText3.setTextColor(Color.WHITE);
            mText3.setBackgroundResource(R.drawable.frame2);
        }
        //翻訳結果
        mTextResult0 = (TextView)findViewById(R.id.txtResult0);
        mTextResult = (TextView)findViewById(R.id.txtResult);
    }

    private void initButtons(){
        //
        mButton1 = (Button)findViewById(R.id.btns1);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "1";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btns2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "2";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btns3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "3";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btns4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "4";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btns5);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "5";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btns6);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "6";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btns7);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "7";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton8 = (Button)findViewById(R.id.btns8);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "8";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton9 = (Button)findViewById(R.id.btns9);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "9";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton10 = (Button)findViewById(R.id.btns10);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "0";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton11 = (Button)findViewById(R.id.btns13);
        String names11 = "s13" + mLangNum;
        int resourceIds11 = getResources().getIdentifier(names11, "string", getPackageName());
        mButton11.setText(resourceIds11);
        mButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "s130";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //数字と合わせてSharedPreferencesに保存
                String s = getResources().getString(resourceId);
                setSharedPreferences(mNum+"歳　"+s);
            }
        });
        //
        mButton12 = (Button)findViewById(R.id.btns14);
        String name421 = "s14" + mLangNum;
        int resourceId421 = getResources().getIdentifier(name421, "string", getPackageName());
        mButton12.setText(resourceId421);
        mButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "s140";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //数字と合わせてSharedPreferencesに保存
                String s = getResources().getString(resourceId);
                setSharedPreferences(mNum+"歳　"+s);
            }
        });

        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = "";
                mTextResult0.setText(mNum);
                mTextResult.setText("");
                //SharedPreferenceもクリアしておく
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("syobyosya1", "").apply();
            }
        });
        //ホーム
        mView.findViewById(R.id.btnHome).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setSharedPreferences(String s){
        //翻訳結果で用いるためSharedPreferenceに登録
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
        sp.edit().putString("syobyosya1", s).apply();
    }
}
