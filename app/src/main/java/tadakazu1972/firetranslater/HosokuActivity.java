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

public class HosokuActivity extends AppCompatActivity {
    protected HosokuActivity mActivity = null;
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
    //アレルギー情報＋妊娠情報格納用
    String mHosoku1 = null;
    String mHosoku2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.hosoku1);
        //選択言語番号を呼び出し
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        mLangNum = sp.getString("language","1"); // 第２引数はkeyが存在しない時に返す初期値
        //アレルギー情報＋妊娠情報格納変数初期化
        mHosoku1 = "";
        mHosoku2 = "";
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.h10);
        String nameText1 = "h10" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //text2
        mText2 = (TextView)findViewById(R.id.h15);
        String nameText2 = "h15" + mLangNum;
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
        mButton1 = (Button)findViewById(R.id.btnh11);
        String nameh11 = "h11" + mLangNum;
        int resourceIdh11 = getResources().getIdentifier(nameh11, "string", getPackageName());
        mButton1.setText(resourceIdh11);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "h110";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mHosoku1 = "アレルギー:"+s;
                setSharedPreferences(mHosoku1, mHosoku2);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btnh12);
        String nameh12 = "h12" + mLangNum;
        int resourceIdh12 = getResources().getIdentifier(nameh12, "string", getPackageName());
        mButton2.setText(resourceIdh12);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "h120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mHosoku1 = "アレルギー:"+s;
                setSharedPreferences(mHosoku1, mHosoku2);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btnh13);
        String nameh13 = "h13" + mLangNum;
        int resourceIdh13 = getResources().getIdentifier(nameh13, "string", getPackageName());
        mButton3.setText(resourceIdh13);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "h130";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mHosoku1 = "アレルギー:"+s;
                setSharedPreferences(mHosoku1, mHosoku2);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btnh14);
        String nameh14 = "h14" + mLangNum;
        int resourceIdh14 = getResources().getIdentifier(nameh14, "string", getPackageName());
        mButton4.setText(resourceIdh14);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "h140";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult0.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mHosoku1 = "アレルギー:"+s;
                setSharedPreferences(mHosoku1, mHosoku2);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btnh16);
        String nameh16 = "h16" + mLangNum;
        int resourceIdh16 = getResources().getIdentifier(nameh16, "string", getPackageName());
        mButton5.setText(resourceIdh16);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "h160";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mHosoku2 = "妊娠:"+s;
                setSharedPreferences(mHosoku1, mHosoku2);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btnh17);
        String nameh17 = "h17" + mLangNum;
        int resourceIdh17 = getResources().getIdentifier(nameh17, "string", getPackageName());
        mButton6.setText(resourceIdh17);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "h170";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                String s = getResources().getString(resourceId);
                mHosoku2 = "妊娠:"+s;
                setSharedPreferences(mHosoku1, mHosoku2);
            }
        });

        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mHosoku1 = "";
                mTextResult0.setText(mHosoku1);
                mHosoku2 = "";
                mTextResult.setText(mHosoku2);
                //SharedPreferenceもクリアしておく
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("hosoku1", "").apply();
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
        sp.edit().putString("hosoku1", s).apply();
    }
}
