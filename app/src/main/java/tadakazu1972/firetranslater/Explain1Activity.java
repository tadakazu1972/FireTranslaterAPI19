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

public class Explain1Activity extends AppCompatActivity {
    protected Explain1Activity mActivity = null;
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
        setContentView(R.layout.explain1);
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
        mText1 = (TextView)findViewById(R.id.e11);
        String nameText1 = "e10" + mLangNum;
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
        mButton1 = (Button)findViewById(R.id.btne1);
        String name1 = "e110";
        int resourceId1 = getResources().getIdentifier(name1, "string", getPackageName());
        mButton1.setText(resourceId1);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e11" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btne2);
        String name2 = "e120";
        int resourceId2 = getResources().getIdentifier(name2, "string", getPackageName());
        mButton2.setText(resourceId2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e12" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btne3);
        String name3 = "e130";
        int resourceId3 = getResources().getIdentifier(name3, "string", getPackageName());
        mButton3.setText(resourceId3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e13" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btne4);
        String name4 = "e140";
        int resourceId4 = getResources().getIdentifier(name4, "string", getPackageName());
        mButton4.setText(resourceId4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e14" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btne5);
        String name5 = "e150";
        int resourceId5 = getResources().getIdentifier(name5, "string", getPackageName());
        mButton5.setText(resourceId5);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e15" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btne6);
        String name6 = "e160";
        int resourceId6 = getResources().getIdentifier(name6, "string", getPackageName());
        mButton6.setText(resourceId6);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e16" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btne7);
        String name7 = "e170";
        int resourceId7 = getResources().getIdentifier(name7, "string", getPackageName());
        mButton7.setText(resourceId7);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e17" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton8 = (Button)findViewById(R.id.btne8);
        String name8 = "e180";
        int resourceId8 = getResources().getIdentifier(name8, "string", getPackageName());
        mButton8.setText(resourceId8);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e18" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton9 = (Button)findViewById(R.id.btne9);
        String name9 = "e190";
        int resourceId9 = getResources().getIdentifier(name9, "string", getPackageName());
        mButton9.setText(resourceId9);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e19" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton10 = (Button)findViewById(R.id.btne10);
        String name10 = "e1100";
        int resourceId10 = getResources().getIdentifier(name10, "string", getPackageName());
        mButton10.setText(resourceId10);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e110" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton11 = (Button)findViewById(R.id.btne11);
        String name11 = "e1110";
        int resourceId11 = getResources().getIdentifier(name11, "string", getPackageName());
        mButton11.setText(resourceId11);
        mButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e111" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton12 = (Button)findViewById(R.id.btne12);
        String name12 = "e1120";
        int resourceId12 = getResources().getIdentifier(name12, "string", getPackageName());
        mButton12.setText(resourceId12);
        mButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e112" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mTextResult.setText("");
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
}
