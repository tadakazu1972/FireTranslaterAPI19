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

public class Inquiry4Activity extends AppCompatActivity {
    protected Inquiry4Activity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
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
    private Button mButton13 = null;
    //電卓数字格納用
    String mNum = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry4);
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
        mText1 = (TextView)findViewById(R.id.i41);
        String nameText1 = "i40" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //
        mTextResult0 = (TextView)findViewById(R.id.txtResult0);
        mTextResult = (TextView)findViewById(R.id.txtResult);
    }

    private void initButtons(){
        //
        mButton1 = (Button)findViewById(R.id.btn41);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "1";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btn42);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "2";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btn43);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "3";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btn44);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "4";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btn45);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "5";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btn46);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "6";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btn47);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "7";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton8 = (Button)findViewById(R.id.btn48);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "8";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton9 = (Button)findViewById(R.id.btn49);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "9";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton10 = (Button)findViewById(R.id.btn410);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mNum = mNum + "0";
                mTextResult0.setText(mNum);
            }
        });
        //
        mButton11 = (Button)findViewById(R.id.btn411);
        String name411 = "i41" + mLangNum;
        int resourceId411 = getResources().getIdentifier(name411, "string", getPackageName());
        mButton11.setText(resourceId411);
        mButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i410";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //数字と合わせてSharedPreferencesに保存
                String s = getResources().getString(resourceId);
                setSharedPreferences(mNum+s);
            }
        });
        //
        mButton12 = (Button)findViewById(R.id.btn412);
        String name421 = "i42" + mLangNum;
        int resourceId421 = getResources().getIdentifier(name421, "string", getPackageName());
        mButton12.setText(resourceId421);
        mButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i420";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //数字と合わせてSharedPreferencesに保存
                String s = getResources().getString(resourceId);
                setSharedPreferences(mNum+s);
            }
        });
        mButton13 = (Button)findViewById(R.id.btn413);
        String name431 = "i43" + mLangNum;
        int resourceId431 = getResources().getIdentifier(name431, "string", getPackageName());
        mButton13.setText(resourceId431);
        mButton13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i430";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //数字と合わせてSharedPreferencesに保存
                String s = getResources().getString(resourceId);
                setSharedPreferences(mNum+s);
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
                sp.edit().putString("result4", "").apply();
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
        sp.edit().putString("result4", s).apply();
    }
}
