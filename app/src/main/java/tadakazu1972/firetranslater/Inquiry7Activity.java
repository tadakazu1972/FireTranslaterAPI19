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

public class Inquiry7Activity extends AppCompatActivity {
    protected Inquiry7Activity mActivity = null;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry7);
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
        mText1 = (TextView)findViewById(R.id.i71);
        String nameText1 = "i70" + mLangNum;
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
        mButton1 = (Button)findViewById(R.id.btn71);
        String name1 = "i71" + mLangNum;
        int resourceId1 = getResources().getIdentifier(name1, "string", getPackageName());
        mButton1.setText(resourceId1);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i710";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btn72);
        String name2 = "i72" + mLangNum;
        int resourceId2 = getResources().getIdentifier(name2, "string", getPackageName());
        mButton2.setText(resourceId2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i720";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btn73);
        String name3 = "i73" + mLangNum;
        int resourceId3 = getResources().getIdentifier(name3, "string", getPackageName());
        mButton3.setText(resourceId3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i730";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btn74);
        String name4 = "i74" + mLangNum;
        int resourceId4 = getResources().getIdentifier(name4, "string", getPackageName());
        mButton4.setText(resourceId4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i740";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btn75);
        String name5 = "i75" + mLangNum;
        int resourceId5 = getResources().getIdentifier(name5, "string", getPackageName());
        mButton5.setText(resourceId5);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i750";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btn76);
        String name6 = "i76" + mLangNum;
        int resourceId6 = getResources().getIdentifier(name6, "string", getPackageName());
        mButton6.setText(resourceId6);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i760";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btn77);
        String name7 = "i77" + mLangNum;
        int resourceId7 = getResources().getIdentifier(name7, "string", getPackageName());
        mButton7.setText(resourceId7);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i770";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton8 = (Button)findViewById(R.id.btn78);
        String name8 = "i78" + mLangNum;
        int resourceId8 = getResources().getIdentifier(name8, "string", getPackageName());
        mButton8.setText(resourceId8);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i780";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton9 = (Button)findViewById(R.id.btn79);
        String name9 = "i79" + mLangNum;
        int resourceId9 = getResources().getIdentifier(name9, "string", getPackageName());
        mButton9.setText(resourceId9);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i790";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton10 = (Button)findViewById(R.id.btn710);
        String name10 = "i710" + mLangNum;
        int resourceId10 = getResources().getIdentifier(name10, "string", getPackageName());
        mButton10.setText(resourceId10);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i7100";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //
        mButton11 = (Button)findViewById(R.id.btn711);
        String name11 = "i711" + mLangNum;
        int resourceId11 = getResources().getIdentifier(name11, "string", getPackageName());
        mButton11.setText(resourceId11);
        mButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i7110";
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
                sp.edit().putString("result7", "").apply();
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
        sp.edit().putString("result7", s).apply();
    }
}
