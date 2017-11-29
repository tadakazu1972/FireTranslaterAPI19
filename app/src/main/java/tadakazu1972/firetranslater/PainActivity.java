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

public class PainActivity extends AppCompatActivity {
    protected PainActivity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mText2 = null;
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
    //痛みの程度＋出血の程度格納用
    String mPain1 = null;
    String mPain2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.pain);
        //選択言語番号を呼び出し
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        mLangNum = sp.getString("language","1"); // 第２引数はkeyが存在しない時に返す初期値
        //痛みの程度＋出血の程度格納変数初期化
        mPain1 = "";
        mPain2 = "";
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.t10);
        String nameText1 = "t10" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //text2
        mText2 = (TextView)findViewById(R.id.t18);
        String nameText2 = "t18" + mLangNum;
        int resourceIdText2 = getResources().getIdentifier(nameText2, "string", getPackageName());
        mText2.setText(resourceIdText2);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText2.setTextColor(Color.WHITE);
            mText2.setBackgroundResource(R.drawable.frame2);
        }
        //翻訳結果
        mTextResult0 = (TextView)findViewById(R.id.txtResult0);
        mTextResult = (TextView)findViewById(R.id.txtResult);
    }

    private void initButtons(){
        //
        mButton1 = (Button)findViewById(R.id.btnt11);
        String namet11 = "t11" + mLangNum;
        int resourceIdt11 = getResources().getIdentifier(namet11, "string", getPackageName());
        mButton1.setText(resourceIdt11);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t110";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btnt12);
        String namet12 = "t12" + mLangNum;
        int resourceIdt12 = getResources().getIdentifier(namet12, "string", getPackageName());
        mButton2.setText(resourceIdt12);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btnt13);
        String namet13 = "t13" + mLangNum;
        int resourceIdt13 = getResources().getIdentifier(namet13, "string", getPackageName());
        mButton3.setText(resourceIdt13);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t130";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btnt14);
        String namet14 = "t14" + mLangNum;
        int resourceIdt14 = getResources().getIdentifier(namet14, "string", getPackageName());
        mButton4.setText(resourceIdt14);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t140";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btnt15);
        String namet15 = "t15" + mLangNum;
        int resourceIdt15 = getResources().getIdentifier(namet15, "string", getPackageName());
        mButton5.setText(resourceIdt15);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t150";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btnt16);
        String namet16 = "t16" + mLangNum;
        int resourceIdt16 = getResources().getIdentifier(namet16, "string", getPackageName());
        mButton6.setText(resourceIdt16);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t160";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btnt17);
        String namet17 = "t17" + mLangNum;
        int resourceIdt17 = getResources().getIdentifier(namet17, "string", getPackageName());
        mButton7.setText(resourceIdt17);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t170";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain1 = "痛み:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });

        //出血の程度
        //
        mButton8 = (Button)findViewById(R.id.btnt19);
        String namet19 = "t19" + mLangNum;
        int resourceIdt19 = getResources().getIdentifier(namet19, "string", getPackageName());
        mButton8.setText(resourceIdt19);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t190";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain2 = "出血:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton9 = (Button)findViewById(R.id.btnt20);
        String namet20 = "t20" + mLangNum;
        int resourceIdt20 = getResources().getIdentifier(namet20, "string", getPackageName());
        mButton9.setText(resourceIdt20);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t200";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain2 = "出血:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });
        //
        mButton10 = (Button)findViewById(R.id.btnt21);
        String namet21 = "t21" + mLangNum;
        int resourceIdt21 = getResources().getIdentifier(namet21, "string", getPackageName());
        mButton10.setText(resourceIdt21);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "t210";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mPain2 = "出血:"+s;
                setSharedPreferences(mPain1, mPain2);
            }
        });

        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mPain1 = "";
                mTextResult0.setText(mPain1);
                mPain2 = "";
                mTextResult.setText(mPain2);
                //SharedPreferenceもクリアしておく
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("pain1", "").apply();
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

    private void setSharedPreferences(String s1, String s2){
        //翻訳結果で用いるためSharedPreferenceに登録
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
        String s = s1 + "\n" +s2; //改行はさんどく
        sp.edit().putString("pain1", s).apply();
    }
}
