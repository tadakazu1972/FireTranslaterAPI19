package tadakazu1972.firetranslater;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class Inquiry1Activity extends AppCompatActivity {
    protected Inquiry1Activity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mText2 = null;
    private TextView mTextResult = null;
    //ボタン
    private Button mSick = null;
    private Button mInjured = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry1);
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
        mText1 = (TextView)findViewById(R.id.i10);
        String nameText1 = "i10" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //text2
        mText2 = (TextView)findViewById(R.id.i11);
        String nameText2 = "i11" + mLangNum;
        int resourceIdText2 = getResources().getIdentifier(nameText2, "string", getPackageName());
        mText2.setText(resourceIdText2);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText2.setTextColor(Color.WHITE);
            mText2.setBackgroundResource(R.drawable.frame2);
        }
        //翻訳結果
        mTextResult = (TextView)findViewById(R.id.textResult);
    }

    private void initButtons(){
        //病気
        mSick = (Button)findViewById(R.id.btnSick);
        String nameSick = "i12" + mLangNum;
        int resourceIdSick = getResources().getIdentifier(nameSick, "string", getPackageName());
        mSick.setText(resourceIdSick);
        mSick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //けが
        mInjured = (Button)findViewById(R.id.btnInjured);
        String nameInjured = "i13" + mLangNum;
        int resourceIdInjured = getResources().getIdentifier(nameInjured, "string", getPackageName());
        mInjured.setText(resourceIdInjured);
        mInjured.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i130";
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
                sp.edit().putString("result1", "").apply();
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
        sp.edit().putString("result1", s).apply();
    }
}
