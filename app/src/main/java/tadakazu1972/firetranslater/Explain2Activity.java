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

public class Explain2Activity extends AppCompatActivity {
    protected Explain2Activity mActivity = null;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.explain2);
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
        mText1 = (TextView)findViewById(R.id.e21);
        String nameText1 = "e20" + mLangNum;
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
        mButton1 = (Button)findViewById(R.id.btne21);
        String name1 = "e210";
        int resourceId1 = getResources().getIdentifier(name1, "string", getPackageName());
        mButton1.setText(resourceId1);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e21" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btne22);
        String name2 = "e220";
        int resourceId2 = getResources().getIdentifier(name2, "string", getPackageName());
        mButton2.setText(resourceId2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e22" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btne23);
        String name3 = "e230";
        int resourceId3 = getResources().getIdentifier(name3, "string", getPackageName());
        mButton3.setText(resourceId3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e23" + mLangNum;
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btne24);
        String name4 = "e240";
        int resourceId4 = getResources().getIdentifier(name4, "string", getPackageName());
        mButton4.setText(resourceId4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "e24" + mLangNum;
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
