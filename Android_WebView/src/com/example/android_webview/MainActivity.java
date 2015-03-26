package com.example.android_webview;

import android.support.v7.app.ActionBarActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private String url = "http://2014.qq.com/";
	private WebView webView;
	private ProgressDialog dialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web);
		
		/*Uri uri = Uri.parse(url); // urlΪ��Ҫ���ӵĵ�ַ
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);*/
		//��ʼ��webview
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		webView=(WebView) findViewById(R.id.webView);
		
		//webview���ر�����Դ
		//webView.loadUrl("file:///android_asset/example.html");
		
		//webview����web��Դ
		//webView.loadUrl("http://wwww.baidu.com");
		webView.loadUrl(url);
		
		//����webviewĬ��ͨ��������������ϵͳ���������ҳ����Ϊ �ǵ���ҳ������webview�д�
		webView.setWebViewClient(new WebViewClient(){
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				//����ֵ��true��ʱ��  ������ҳ��webview��ȥ�� �����false ����ϵͳ�������������
				view.loadUrl(url);
				return true;
			}
			//WebviewClient ����webviewȥ����һЩҳ����ƺ�����֪ͨ
			
			
		});
		//����֧��javascript
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);   //���ʱ����һ�����ذ�ť��ʱ�� ����Ӧ�ö��˳��˶�����ֻ���ص���ҳ��ȥ��
		//Ϊ�˸��û��Ѻõ���ʾ ����ͨ�����ý���������ʾ  �ж�ҳ��ļ��ع���
		webView.setWebChromeClient(new WebChromeClient(){
			@Override
			public void onProgressChanged(WebView view, int newProgress) {
				// TODO Auto-generated method stub
				//newProgress 1-100֮�������
				if (newProgress==100) {
					//��ҳ������� �رս�����
					closeDialog();
				}else {
					//��ҳ���ڼ���  �򿪽������ñ��˿���
					openDialog(newProgress);
				}
			}

			private void closeDialog() {
				// TODO Auto-generated method stub
				if (dialog!=null&&dialog.isShowing()) {
					dialog.dismiss();
					dialog=null;
				}
			}

			private void openDialog(int newProgress) {
				// TODO Auto-generated method stub
				if (dialog==null) {
					dialog=new ProgressDialog(MainActivity.this);
					dialog.setTitle("���ڼ���...");
					dialog.setProgress(newProgress);
					dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
					dialog.show();
				}
			}
		});
	}

	//��д�����������ص��߼�
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode==KeyEvent.KEYCODE_BACK) {   //����İ������ڷ��ذ�ť��ʱ��
			//�����·��ذ�ť��ʱ��  �ᵯ��һ��֮ǰ�ĵ�ַ�Ի��� ��ʾ����
			Toast.makeText(this, webView.getUrl(), Toast.LENGTH_SHORT).show();
			if (webView.canGoBack()) {
				webView.goBack();//������һҳ��
				return true;
			}else {
				System.exit(0);//���������˳�����Ĵ���
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}