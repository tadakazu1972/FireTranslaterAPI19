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

public class Inquiry3Activity extends AppCompatActivity {
    protected Inquiry3Activity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry3);
        //選択言語番号を呼び出し
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        mLangNum = sp.getString("language","1"); // 第２引数はkeyが存在しない時に返す初期値
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.i31);
        String nameText1 = "i30" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //
        mTextResult = (TextView)findViewById(R.id.txtResult);
    }

    private void initButtons(){
        //
        mButton1 = (Button)findViewById(R.id.btn31);
        String name31 = "i31" + mLangNum;
        int resourceId31 = getResources().getIdentifier(name31, "string", getPackageName());
        mButton1.setText(resourceId31);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i310";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btn32);
        String name32 = "i32" + mLangNum;
        int resourceId32 = getResources().getIdentifier(name32, "string", getPackageName());
        mButton2.setText(resourceId32);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i320";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btn33);
        String name33 = "i33" + mLangNum;
        int resourceId33 = getResources().getIdentifier(name33, "string", getPackageName());
        mButton3.setText(resourceId33);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i330";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btn34);
        String name34 = "i34" + mLangNum;
        int resourceId34 = getResources().getIdentifier(name34, "string", getPackageName());
        mButton4.setText(resourceId34);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i340";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btn35);
        String name35 = "i35" + mLangNum;
        int resourceId35 = getResources().getIdentifier(name35, "string", getPackageName());
        mButton5.setText(resourceId35);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i350";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btn36);
        String name36 = "i36" + mLangNum;
        int resourceId36 = getResources().getIdentifier(name36, "string", getPackageName());
        mButton6.setText(resourceId36);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i360";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btn37);
        String name37 = "i37" + mLangNum;
        int resourceId37 = getResources().getIdentifier(name37, "string", getPackageName());
        mButton7.setText(resourceId37);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i370";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton8 = (Button)findViewById(R.id.btn38);
        String name38 = "i38" + mLangNum;
        int resourceId38 = getResources().getIdentifier(name38, "string", getPackageName());
        mButton8.setText(resourceId38);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i380";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton9 = (Button)findViewById(R.id.btn39);
        String name39 = "i39" + mLangNum;
        int resourceId39 = getResources().getIdentifier(name39, "string", getPackageName());
        mButton9.setText(resourceId39);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i390";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton10 = (Button)findViewById(R.id.btn310);
        String name310 = "i310" + mLangNum;
        int resourceId310 = getResources().getIdentifier(name310, "string", getPackageName());
        mButton10.setText(resourceId310);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i3100";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton11 = (Button)findViewById(R.id.btn311);
        String name311 = "i311" + mLangNum;
        int resourceId311 = getResources().getIdentifier(name311, "string", getPackageName());
        mButton11.setText(resourceId311);
        mButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i3110";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton12 = (Button)findViewById(R.id.btn312);
        String name321 = "i312" + mLangNum;
        int resourceId321 = getResources().getIdentifier(name321, "string", getPackageName());
        mButton12.setText(resourceId321);
        mButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i3120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });

        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mTextResult.setText("");
                //SharedPreferenceもクリアしておく
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("result3", "").apply();
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

    private void setSharedPreferences(int resId){
        //翻訳結果で用いるためSharedPreferenceに登録
        String s = getResources().getString(resId);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
        sp.edit().putString("result3", s).apply();
    }
}
