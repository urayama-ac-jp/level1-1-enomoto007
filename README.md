# 【第1回】フレームワークを使ったプログラミング
## テーマ
1. フレームワークを使ったプログラムを体験してみよう
2. hello worldに挑戦してみよう

## 開発環境について
* この演習では、Codespacesと呼ばれるサービスを使って開発を行います。
* ブラウザ上で動作する開発環境です、インストール不要で使う事ができます。

## まずは動かしてみよう
1. Codeをクリックします。<br>![image](https://user-images.githubusercontent.com/93235101/149875383-0394aed2-2635-46e1-a3d3-6b0ad9c898b1.png)

2. `New codespace`を選択します。<br>![149873651-f33ff9d4-47e4-458a-9efa-ebd9d00a29d4](https://user-images.githubusercontent.com/93235101/149875436-7b806ad5-4d6d-4d23-91f7-e149494ecca7.png)

3. `4-core`を選択し、`Create codespace`をクリックします。<br>![image](https://user-images.githubusercontent.com/93235101/149875457-c33e888b-7979-410c-81ca-128ebd2d9fcd.png)

4. しばらく待ちます。<br>![image](https://user-images.githubusercontent.com/93235101/149875470-df4edec6-eba7-4431-8ee4-c474c198ea45.png)

5. 画像のダイアログが表示されたら、以下のボタンを押してください。<br>![image](https://user-images.githubusercontent.com/32722128/150625789-e06f778b-a07d-4338-8506-216d10400f79.png)

6. インストールボタンを押された後、新しいタブが開きます。緑で囲んだ部分が`Disable`になったらタブを閉じましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150741593-8de38b39-8076-47d3-a8db-c96484eee735.png)

* `Get Started`タブも閉じましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150743768-64b64d55-fdf8-4146-94f9-3310c74a6866.png)

7. 虫と再生ボタンのアイコンを押します。<br>![image](https://user-images.githubusercontent.com/93235101/149875480-b6d0189c-52f3-45dd-bcc3-335bff5d76d0.png)

8. `Launch AssignmentApplication`が選択されていることを確認し再生ボタンを押します。<br>初回はダイアログが表示されます、YESを選択してください。<br>![image](https://user-images.githubusercontent.com/93235101/149875513-ded6ea34-792e-40da-927e-215d7e22bbf2.png)![image](https://user-images.githubusercontent.com/93235101/149875530-d1437647-e1ac-44bf-a785-36615ae83e6f.png)

9. `Open in Browser`を押します。(表示されるまでしばらく時間が掛かります。)<br>![image](https://user-images.githubusercontent.com/93235101/149875545-6689fe73-7a32-4be8-8658-eaf8c8ddd460.png)

10. Webページが表示されます。<br>![image](https://user-images.githubusercontent.com/93235101/149875560-aee01420-6222-495b-9d91-99fd15141698.png)

11. `Let's try!`を押します。<br>![image](https://user-images.githubusercontent.com/32722128/150732764-05708cf8-7d58-483b-8cdd-d49d53f1e9af.png)

12. `ここを書き換えてみよう!`と表示されていることを確認しましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150740231-80b66ad1-d0f7-448a-84aa-3bf1e6f0bba7.png)

13. 確認が終わったら、タブを閉じましょう<br>![image](https://user-images.githubusercontent.com/32722128/150733257-a1056c19-1b24-412b-8bfc-a6063e75c785.png)

14. デバック実行中ですので、停止ボタンを押して、デバック実行を停止しましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150748527-d7121765-5142-4f5a-9769-33c0c23627a4.png)

## 解説
### ページ表示について(ControllerクラスとThymeleaf)
#### Step1Controllerクラス(コントローラークラス)について
* WEBページのリンクボタン(他のページに移動するボタン)を押すと、ブラウザからリクエストが送信されます。
* リクエストには移動先のページのURLが含まれています。

* URLの例
![image](https://user-images.githubusercontent.com/32722128/151471031-ac57fa7a-646d-4464-b5a3-60e881cf07c6.png)

* このURLで指定されるパス(ディレクトリ名)によって、処理されるクラス、メソッドが指定されます。
* どのパスに対するリクエストをどのクラスのどのメソッドに処理させるのかは、`@RequestMapping`、`@GetMapping`などのアノテーションで指定されています。
* 今回の演習の対象である、`Step1Controller`クラスには`@RequestMapping("/step1")`というアノテーションが指定されています。
* これは`/step1`というパスに対して送られたリクエストを`Step1Controller`クラスにて処理する事を指定しています。
* また`index`メソッドには、`@GetMapping`とアノテーションがついていますが、これはHTTPリクエストメソッドがGETの場合は、`index`メソッドでリクエストを受け付ける事を指定しています。
![image](https://user-images.githubusercontent.com/32722128/151478427-9eef6834-5fbb-4d4b-a44a-a1a25fc544fb.png)

* addAttributeメソッドを使用して、Thymeleaf(タイムリーフ)に対して値を渡しています、  
* addAttributeメソッドの第一引数に変数名、第二引数に渡したい値を指定しています。　　
![image](https://user-images.githubusercontent.com/32722128/151489468-ef4567c4-7cd7-48a0-941e-6ebc1fb04442.png)


[参考資料：HTTPリクエストメソッドについて](https://wa3.i-3-i.info/word11405.html)

#### Thymeleaf(タイムリーフ)について
* ThymeleafはSpring Bootでの使用が推奨されている、テンプレートエンジンです。  
* テンプレートエンジンとは、データとテンプレートを合体させ文字列を作る仕組みの事です。  
* ここではデータとテンプレートを組み合わせてHTMLを生成しています。  
* 生成したHTMLをブラウザに応答し、ブラウザがHTMLを解釈しWEBページの表示を行っています。

#### テンプレート
  
```
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
  xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
  xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" th:href="@{/favicon/favicon.ico}">
  <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css"
    integrity="sha384-Uu6IeWbM+gzNVXJcM9XV3SohHtmWE+3VGi496jvgX1jyvDTXfdK+rfZc8C1Aehk5" crossorigin="anonymous">
  <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/grids-responsive-min.css">
  <link rel="stylesheet" th:href="@{/css/styles.css}">
  <title>STEP-1</title>
</head>

<body>
  <div class="l-content">
    <div class="information pure-g">
      <div class="pure-u-1">
        <div class="l-box">
          <h1 class="information-head">STEP-1 文字を表示してみよう！</h1>
          <p>レベル１（基礎）</p>
          <p th:text="${title}">Title</p>
        </div>
      </div>
    </div>
  </div>
</body>
```

#### 生成されたHTML

```
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
  xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" href="/favicon/favicon.ico">
  <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css"
    integrity="sha384-Uu6IeWbM+gzNVXJcM9XV3SohHtmWE+3VGi496jvgX1jyvDTXfdK+rfZc8C1Aehk5" crossorigin="anonymous">
  <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/grids-responsive-min.css">
  <link rel="stylesheet" href="/css/styles.css">
  <title>STEP-1</title>
</head>

<body>
  <div class="l-content">
    <div class="information pure-g">
      <div class="pure-u-1">
        <div class="l-box">
          <h1 class="information-head">STEP-1 文字を表示してみよう！</h1>
          <p>レベル１（基礎）</p>
          <p>ここを書き換えてみよう!</p>
        </div>
      </div>
    </div>
  </div>
</body>

</html>
```

* Thymeleafによって、テンプレートの`<p th:text="${title}">Title</p>`の部分が、HTMLでは`<p>ここを書き換えてみよう!</p>`に書き換えられています。  
* `th:text="${title}"`は「title」という変数名で指定された変数の値で、pタグ内の文字列を置き換えるという構文になります。
* Step1Controllerのindexメソッド内で、addAttributeメソッドを使用して設定した変数の値で置き換えられています。

## 演習level1 step1
* 画面表示する文字列を書き換えてみましょう。

1. STEP-1のページを開きます。<br>![image](https://user-images.githubusercontent.com/93235101/149875575-8c86ff4c-88ef-4b23-ac45-be5f6ef1d201.png)

2. 表示されている`ここを書き換えてみよう! `を `hello world`に書き換えてみましょう。<br>![image](https://user-images.githubusercontent.com/93235101/149875582-a12f22e9-0f6e-40b7-ae1b-b5346197cb5b.png)

### ヒント
* `~/src/main/java/com/classroom/assignment/controller/Step1Controller.java`
* ファイルを書き換えてみましょう。

1. `エクスプローラーボタン`を押しましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150728805-5aaa5e67-cd79-455b-a12c-3a713cb2632e.png)

2. `src`を選択します。<br>![image](https://user-images.githubusercontent.com/32722128/150728960-d891930a-721d-47c1-a26b-e3fa1478cb5c.png)

3. `main`を選択します。<br>![image](https://user-images.githubusercontent.com/32722128/150729039-049c0741-0d77-40a9-951f-eaee91812174.png)

4. `java`を選択します。<br>![image](https://user-images.githubusercontent.com/32722128/150729164-cdd77013-af16-466f-bbfc-3a57dbddf941.png)

5. `Controller`を選択します。<br>![image](https://user-images.githubusercontent.com/32722128/150730507-71622d09-1a14-43d6-b9ae-a9ad5f8af2d5.png)

6. `Step1Controller.java`を選択します。<br>![image](https://user-images.githubusercontent.com/32722128/150730661-285297a3-3c07-4f12-86ee-c042850b1d4d.png)

7. `ここを書き換えてみよう!`の部分を`hello world`に書き換えてください。(ダブルコーテーション「""」の中身だけを書き換えましょう。)<br>![image](https://user-images.githubusercontent.com/32722128/150730943-cb97b928-311f-44ac-8eeb-ec3f3243427b.png)

8. 動作確認をしましょう、虫と再生ボタンのアイコンを押します。<br>![image](https://user-images.githubusercontent.com/93235101/149875480-b6d0189c-52f3-45dd-bcc3-335bff5d76d0.png)

9. `Launch AssignmentApplication`が選択されていることを確認し再生ボタンを押します。
* 初回はダイアログが表示されます、YESを選択してください。
![image](https://user-images.githubusercontent.com/93235101/149875513-ded6ea34-792e-40da-927e-215d7e22bbf2.png)

10. `Open in Browser`を押します。<br>![image](https://user-images.githubusercontent.com/93235101/149875545-6689fe73-7a32-4be8-8658-eaf8c8ddd460.png)

11. `Let's try!`を押します。<br>![image](https://user-images.githubusercontent.com/32722128/150732764-05708cf8-7d58-483b-8cdd-d49d53f1e9af.png)

12. `hello world`に表示が変わっていることを確認しましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150732862-b3030def-8fcb-482e-8e72-e2c681cd5317.png)

13. 確認が終わったら、タブを閉じましょう<br>![image](https://user-images.githubusercontent.com/32722128/150733257-a1056c19-1b24-412b-8bfc-a6063e75c785.png)

14. デバック実行中ですので、停止ボタンを押して、デバック実行を停止しましょう。<br>![image](https://user-images.githubusercontent.com/32722128/150748527-d7121765-5142-4f5a-9769-33c0c23627a4.png)

## テスト
* 提出前に回答があっているかテストしてみましょう。

1. `~/src/test/java/com/classroom/assignment/controller/api/Step1ControllerTests.java`を開きます。<br>![image](https://user-images.githubusercontent.com/93235101/149875617-108b892d-fd16-4a98-9386-f57c9491c9e6.png)

2. shouldReturnDefaultMessagメソッド前の再生ボタンをクリックします。<br>![image](https://user-images.githubusercontent.com/93235101/149875648-de485a6b-ffbb-4be5-bd3b-fb69c97a138a.png)

3. 再生ボタンがチェックマークに変わればテスト成功です！<br>![image](https://user-images.githubusercontent.com/93235101/149875661-75476780-d8a5-4965-bb8b-b30aad14f190.png)

## 課題を提出しましょう
* 以下の操作を行い課題を提出しましょう。
1. Commit(コミット)
* Commitは、追加・変更したファイルをGitに登録するための操作です。

2. Push(プッシュ)
* pushは、コミットした内容をローカルレポジトリからリモートリポジトリに送信する操作です。

3. Pull Request(プルリクエスト)
* Pull Requestは、開発者のローカルレポジトリでの変更を他の開発者に通知する機能です。

### 手順
1. 木の枝のようなマークを押します。<br>
![image](https://user-images.githubusercontent.com/32722128/149911899-77da4cf0-cf8e-4b74-af63-1592156f4e9c.png)

2. これまでに行ったファイルへの変更ないようが表示されています。
* 変更内容に問題がないか今一度確認しましょう。 
![image](https://user-images.githubusercontent.com/32722128/149912420-00d3f65f-d50c-4b78-a0d6-1dfae21389f1.png)

3. コミットするファイルを選択しましょう。
* コミットしたいファイルの横の＋ボタンを押しましょう。
![image](https://user-images.githubusercontent.com/32722128/149912930-bd2d559c-0456-41d0-82bc-aa32376ad3c4.png)

4. Staged Changesにコミットしたいファイルが含まれていることを確認しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/149913113-2b2f3b32-ea97-41f6-b805-60dd5b05d2dc.png)

5. Message欄にCommit Message(コミットメッセージ)を入力しましょう。
* Commit Messageには、今回のコミットの追加・変更内容について記載します。
* 今回は「STEP-1ページのメッセージを変更」としておきましょう。
![image](https://user-images.githubusercontent.com/32722128/149915153-848dd391-5a21-4581-a2f8-a1f635f97386.png)

6. チェックボタンを押してコミットしましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/149915586-633c9a2f-06e4-4815-89f3-3008bfe4cfdc.png)

7. Sync Changesボタンを押してコミットをプッシュしましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/149915829-c0834f7e-5db2-49cb-9047-94f2474c7d3f.png)

8. ダイアログが出ますので「OK」を押しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/149915978-5eeba149-394a-4bba-bcc2-c9afd620681d.png)

9. Sync Changesボタンが消えていることを確認してください。<br>
![image](https://user-images.githubusercontent.com/32722128/149916219-5940a267-d83e-4b1d-a3b5-6fb6a11c3a90.png)

10. 画面左下の緑のボタンを押しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/149916623-5677f1e5-a18a-4dda-a8f0-ff486ef98ec5.png)

11. 画面中央上部の「現在のCodespaceを中断する」を押します。
![image](https://user-images.githubusercontent.com/32722128/149916882-182b2b1c-8cd2-4317-a2b0-6a7f085811b9.png)

12. タブを×ボタンで閉じましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/149917438-0d04f110-2f42-44b1-b599-7a020dd83993.png)

13. 画面コピーの画面に戻ります。<br>
![image](https://user-images.githubusercontent.com/32722128/149993006-9c23498e-f725-4199-a92d-a6d2d4a26347.png)

14. 「Pull requests」ボタンを押します。<br>
![image](https://user-images.githubusercontent.com/32722128/149993180-14ce060f-364e-473c-9250-aa13a7235f68.png)

15.　講師からのフィードバックがある場合は、この画面に表示されます。<br>
![image](https://user-images.githubusercontent.com/32722128/149993320-3cf0c0ce-c495-4e9d-8665-0f2978c457b4.png)

# 課題を提出したら、Codespacesを終了しましょう
* Codespacesはブラウザタブの×ボタンで閉じないようにしてください、以下の手順で終了してください。
1. 画面左下の緑のボタンを押しましょう。
![image](https://user-images.githubusercontent.com/32722128/149916623-5677f1e5-a18a-4dda-a8f0-ff486ef98ec5.png)

2. 画面中央上部の「現在のCodespaceを中断する」を押します。
![image](https://user-images.githubusercontent.com/32722128/149916882-182b2b1c-8cd2-4317-a2b0-6a7f085811b9.png)

3. タブを×ボタンで閉じましょう。
![image](https://user-images.githubusercontent.com/32722128/149917438-0d04f110-2f42-44b1-b599-7a020dd83993.png)

