# [ByteLegend](https://bytelegend.com) Challenge of JavaIsland: OOP, Encapsulation

<details open='true'>
<summary>English</summary>

## Understand Importance of Encapsulation by Adding Audit Logs

`Person` class has a `salary` field, since salary is usually sensitive information,
we want any code that accesses `salary` field to be recorded in the log for audit later.

Please use `Logger.logAccessToSalaryOfPerson()` to record a log whenever you access `salary` field of `Person` class,
for example:

```
int salary = person.salary;
Logger.logAccessToSalaryOfPerson(person.name);
```

For the code without encapsulation, we need to add logs to all the places that access `salary` field.
For the code with encapsulation, we only need to change the implementation of `getSalary()` method - nothing else needs to be changed.


Please make the change to `com.bytelegend.noencapsulation.Person` (without encapsulation)and
`com.bytelegend.encapsulation.Person` (with encapsulation) classes, and understand the importance of encapsulation:
hiding implementation details, so that new features in the future will not affect the existing code.
Note that you may need to modify corresponding code in
[`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java)
and [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java).

- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-add-audit-log` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can click [import project into IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md)/[import project into VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md).
    - Before submitting your code, you'd better run `mvn verify` locally to save time. Don't know how? See [verify locally in IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md)/[verify locally in VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork [the repo](https://github.com/ByteLegendQuest/java-add-audit-log), finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/encapsulation/`
- `src/main/java/com/bytelegend/noencapsulation/`

</details>

<details>
<summary>简体中文</summary>

## 为有封装和无封装的代码类添加审计日志，体会封装的重要性。

`Person`类有一个`salary`字段，因为薪水通常是比较敏感的信息，我们希望任何访问`salary`字段的代码都能被记录在日志中，以备日后审计。
请在任何访问了`salary`字段的代码中，都使用`Logger.logAccessToSalaryOfPerson()`记录一条日志，如：

```
int salary = person.salary;
Logger.logAccessToSalaryOfPerson(person.name);
```

对于没有使用封装的代码，我们需要一一将所有访问`salary`的地方添加日志。
而对于使用了封装的代码，我们只需要修改`getSalary()`方法的实现即可，其他地方不需要任何改动。


请分别为无封装的`com.bytelegend.noencapsulation.Person`类和有封装的`com.bytelegend.encapsulation.Person`类作出上述变更，
体会封装的重要性：隐藏实现细节，使得未来添加新功能变得容易，不会影响到现有代码。注意你可能需要同时修改
[`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java)
和[`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java)中的相应代码。

- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-add-audit-log`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[导入IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/zh_hans/clone-and-import.md)/[导入VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/zh_hans/clone-and-import-vscode.md)。
    - 在提交之前，你最好先在本地运行`mvn verify`验证一下答案，以节约时间。不知道如何做？请查看[在IDEA中本地验证](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/zh_hans/run-mvn-verify-idea.md)/[在VSCode中本地验证](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/zh_hans/run-mvn-verify-vscode.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork[这个仓库](https://github.com/ByteLegendQuest/java-add-audit-log)、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/PvmqK3hF)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/encapsulation/`
- `src/main/java/com/bytelegend/noencapsulation/`

</details>

<details>
<summary>繁體中文</summary>

通過添加審計日誌了解封裝的重要性
----------------

`Person`類有一個`salary`字段，由於salary通常是敏感信息，我們希望任何訪問`salary`字段的代碼都記錄在日誌中以供以後審核。

每次訪問`Person`類的`salary`字段時，請使用`Logger.logAccessToSalaryOfPerson()`記錄日誌，例如：

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

對於沒有封裝的代碼，我們需要在所有訪問`salary`字段的地方添加日誌。對於有封裝的代碼，我們只需要改變`getSalary()`方法的實現——其他什麼都不需要改變。

請對`com.bytelegend.noencapsulation.Person` （無封裝）和`com.bytelegend.encapsulation.Person` （有封裝）類進行更改，並理解封裝的重要性：隱藏實現細節，這樣以後的新功能就不會影響現有代碼。請注意，您可能需要修改[`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java)和[`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java)中的相應代碼。

-   您可以通過以下任何方式完成此挑戰：
    -   建議初學者：運行`git clone https://github.com/ByteLegendQuest/java-add-audit-log`下載代碼，在本地 IDE 中完成挑戰，然後在 Web 編輯器中復制/粘貼/提交答案。
        -   如果你不知道怎麼做，你可以點擊[import project into IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) 。
        -   在提交代碼之前，您最好在本地運行`mvn verify`以節省時間。不知道怎麼樣？請參閱[在 IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) [中進行本地驗證/在 VSCode 中進行本地驗證](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md)。
    -   非常不推薦：如果你不喜歡`git`操作，可以[點擊這裡下載壓縮代碼](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main)。
    -   或者：如果您有足夠的信心直接在 Web 編輯器中編寫代碼，請繼續。
    -   或者：如果你熟悉 GitHub，你可以 fork[倉庫](https://github.com/ByteLegendQuest/java-add-audit-log)，完成挑戰並創建一個拉取請求。
-   機器人會檢查你的 PR 並告訴你是否完成了挑戰。
-   回到[ByteLegend](https://bytelegend.com)繼續你的英雄之旅。

祝你好運！

如果您需要任何幫助，請隨時加入[Discord 社區](https://discord.gg/35RreUUGWt)或通過[contact@bytelegend.com](mailto:contact@bytelegend.com)聯繫我們。

**注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Español</summary>

Comprender la importancia de la encapsulación mediante la adición de registros de auditoría
-------------------------------------------------------------------------------------------

La clase de `Person` tiene un campo de `salary` , dado que el salario suele ser información confidencial, queremos que cualquier código que acceda al campo de `salary` se registre en el registro para una auditoría posterior.

Utilice `Logger.logAccessToSalaryOfPerson()` para registrar un registro cada vez que acceda al campo de `salary` de la clase `Person` , por ejemplo:

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Para el código sin encapsulación, necesitamos agregar registros a todos los lugares que acceden al campo de `salary` . Para el código con encapsulación, solo necesitamos cambiar la implementación del método `getSalary()` ; no es necesario cambiar nada más.

Realice el cambio a las `com.bytelegend.noencapsulation.Person` (sin encapsulación) y `com.bytelegend.encapsulation.Person` (con encapsulación), y comprenda la importancia de la encapsulación: ocultar los detalles de implementación, de modo que las nuevas funciones en el futuro no afectar el código existente. Tenga en cuenta que es posible que deba modificar el código correspondiente en [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) y [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   Puede lograr este desafío de cualquier manera a continuación:
    -   Recomendado para principiantes: ejecute `git clone https://github.com/ByteLegendQuest/java-add-audit-log` para descargar el código, finalice el desafío en su IDE local, luego copie/pegue/envíe la respuesta en el editor web.
        -   Si no sabe cómo hacerlo, puede hacer clic en [importar proyecto a IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [importar proyecto a VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar su código, es mejor que ejecute `mvn verify` localmente para ahorrar tiempo. ¿No sabes cómo? Ver [verificar localmente en IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente en VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muy poco recomendado: puede [hacer clic aquí para descargar el código comprimido](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) si no le gustan las operaciones de `git` .
    -   O: si tiene la confianza suficiente para escribir código en el editor web directamente, adelante.
    -   O: si está familiarizado con GitHub, puede bifurcar [el repositorio](https://github.com/ByteLegendQuest/java-add-audit-log) , finalizar el desafío y crear una solicitud de extracción.
-   El bot verificará tu PR y te dirá si logras el desafío.
-   Regrese a [ByteLegend](https://bytelegend.com) y continúe su viaje de héroe.

¡Buena suerte!

Si necesita ayuda, no dude en unirse a la [comunidad de Discord](https://discord.gg/35RreUUGWt) o contáctenos a través de [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: solo le permitimos modificar los siguientes archivos. Cualquier cambio en los archivos que no sean los siguientes archivos será rechazado:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>العربية</summary>

افهم أهمية التغليف عن طريق إضافة سجلات تدقيق
--------------------------------------------

تحتوي فئة `Person` على حقل `salary` ، نظرًا لأن الراتب عادةً ما يكون معلومات حساسة ، فنحن نريد تسجيل أي رمز يصل إلى حقل `salary` في السجل للتدقيق لاحقًا.

الرجاء استخدام `Logger.logAccessToSalaryOfPerson()` لتسجيل سجل كلما قمت بالوصول إلى حقل `salary` لفئة `Person` ، على سبيل المثال:

 `int salary = person.salary; Logger.logAccessToSalaryOfPerson(person.name);`

بالنسبة للكود بدون تغليف ، نحتاج إلى إضافة سجلات إلى جميع الأماكن التي تصل إلى حقل `salary` . بالنسبة إلى الكود مع التغليف ، نحتاج فقط إلى تغيير تنفيذ طريقة `getSalary()` - لا حاجة لتغيير أي شيء آخر.

يرجى إجراء التغيير على `com.bytelegend.noencapsulation.Person` (بدون تغليف) و `com.bytelegend.encapsulation.Person` (مع التغليف) ، وفهم أهمية التغليف: إخفاء تفاصيل التنفيذ ، بحيث لا تكون الميزات الجديدة في المستقبل تؤثر على الكود الحالي. لاحظ أنك قد تحتاج إلى تعديل الكود المقابل في [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) و [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   يمكنك إنجاز هذا التحدي بأي طريقة أدناه:
    -   موصى به للمبتدئين: قم بتشغيل `git clone https://github.com/ByteLegendQuest/java-add-audit-log` لتنزيل الكود ، وإنهاء التحدي في IDE المحلي الخاص بك ، ثم نسخ / لصق / إرسال الإجابة في محرر الويب.
        -   إذا كنت لا تعرف كيف يمكنك النقر فوق [استيراد مشروع إلى IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [استيراد مشروع إلى VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   قبل إرسال التعليمات البرمجية الخاصة بك ، من الأفضل تشغيل `mvn verify` محليًا لتوفير الوقت. لا أعرف كيف؟ انظر [التحقق محليًا في IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [تحقق محليًا في VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   غير موصى به على الإطلاق: يمكنك [النقر هنا لتنزيل رمز مضغوط](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) إذا كنت لا تحب عمليات `git` .
    -   أو: إذا كنت واثقًا بدرجة كافية لكتابة التعليمات البرمجية في محرر الويب مباشرةً ، فابدأ.
    -   أو: إذا كنت معتادًا على GitHub ، فيمكنك تفرع [الريبو](https://github.com/ByteLegendQuest/java-add-audit-log) وإنهاء التحدي وإنشاء طلب سحب.
-   سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.
-   ارجع إلى [ByteLegend وتابع](https://bytelegend.com) رحلة بطلك.

حظا طيبا وفقك الله!

إذا كنت بحاجة إلى أي مساعدة ، فلا تتردد في الانضمام إلى [مجتمع Discord](https://discord.gg/35RreUUGWt) أو الاتصال بنا عبر [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Português</summary>

Entenda a importância do encapsulamento adicionando logs de auditoria
---------------------------------------------------------------------

A classe `Person` possui um campo `salary` , já que salário geralmente é uma informação sensível, queremos que qualquer código que acesse o campo `salary` seja registrado no log para auditoria posterior.

Por favor, use `Logger.logAccessToSalaryOfPerson()` para gravar um log sempre que você acessar o campo `salary` da classe `Person` , por exemplo:

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Para o código sem encapsulamento, precisamos adicionar logs em todos os locais que acessam o campo `salary` . Para o código com encapsulamento, precisamos apenas alterar a implementação do método `getSalary()` - nada mais precisa ser alterado.

Faça a alteração para as `com.bytelegend.noencapsulation.Person` (sem encapsulamento) e `com.bytelegend.encapsulation.Person` (com encapsulamento) e entenda a importância do encapsulamento: ocultando detalhes de implementação, para que novos recursos no futuro não afetar o código existente. Observe que pode ser necessário modificar o código correspondente em [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) e [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   Você pode realizar este desafio de qualquer maneira abaixo:
    -   Recomendado para iniciantes: execute `git clone https://github.com/ByteLegendQuest/java-add-audit-log` para baixar o código, termine o desafio em seu IDE local e copie/cole/envie a resposta no editor da web.
        -   Se você não sabe como, você pode clicar em [import project into IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar seu código, é melhor você executar `mvn verify` localmente para economizar tempo. Não sei como? Consulte [verificar localmente em IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente em VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muito não recomendado: você pode [clicar aqui para baixar o código zipado](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) se não gostar das operações do `git` .
    -   Ou: se você estiver confiante o suficiente para escrever código diretamente no editor da web, vá em frente.
    -   Ou: se você estiver familiarizado com o GitHub, você pode fazer o fork [do repo](https://github.com/ByteLegendQuest/java-add-audit-log) , finalizar o desafio e criar uma pull request.
-   O bot verificará seu PR e informará se você cumprir o desafio.
-   Volte para [ByteLegend](https://bytelegend.com) e continue sua jornada de herói.

Boa sorte!

Se precisar de ajuda, sinta-se à vontade para se juntar à [Comunidade Discord](https://discord.gg/35RreUUGWt) ou entre em contato conosco via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: só permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os arquivos a seguir serão rejeitadas:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Bahasa Indonesia</summary>

Memahami Pentingnya Enkapsulasi dengan Menambahkan Log Audit
------------------------------------------------------------

Kelas `Person` memiliki bidang `salary` , karena gaji biasanya merupakan informasi sensitif, kami ingin kode apa pun yang mengakses bidang `salary` dicatat dalam log untuk diaudit nanti.

Silakan gunakan `Logger.logAccessToSalaryOfPerson()` untuk merekam log setiap kali Anda mengakses bidang `salary` kelas `Person` , misalnya:

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Untuk kode tanpa enkapsulasi, kita perlu menambahkan log ke semua tempat yang mengakses bidang `salary` . Untuk kode dengan enkapsulasi, kita hanya perlu mengubah implementasi metode `getSalary()` - tidak ada lagi yang perlu diubah.

Harap buat perubahan ke `com.bytelegend.noencapsulation.Person` (tanpa enkapsulasi) dan `com.bytelegend.encapsulation.Person` (dengan enkapsulasi), dan pahami pentingnya enkapsulasi: menyembunyikan detail implementasi, sehingga fitur baru di masa mendatang tidak akan mempengaruhi kode yang ada. Perhatikan bahwa Anda mungkin perlu memodifikasi kode yang sesuai di [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) dan [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   Anda dapat menyelesaikan tantangan ini melalui cara apa pun di bawah ini:
    -   Direkomendasikan untuk pemula: jalankan `git clone https://github.com/ByteLegendQuest/java-add-audit-log` untuk mengunduh kode, selesaikan tantangan di IDE lokal Anda, lalu salin/tempel/kirim jawabannya di editor web.
        -   Jika Anda tidak tahu caranya, Anda bisa mengklik [import project into IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Sebelum mengirimkan kode Anda, Anda sebaiknya menjalankan `mvn verify` secara lokal untuk menghemat waktu. Tidak tahu bagaimana? Lihat [verifikasi secara lokal di IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [verifikasi secara lokal di VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sangat tidak direkomendasikan: Anda dapat [mengklik di sini untuk mengunduh kode zip](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) jika Anda tidak menyukai operasi `git` .
    -   Atau: jika Anda cukup percaya diri untuk menulis kode di editor web secara langsung, silakan.
    -   Atau: jika Anda terbiasa dengan GitHub, Anda dapat melakukan fork [repo](https://github.com/ByteLegendQuest/java-add-audit-log) , menyelesaikan tantangan, dan membuat permintaan tarik.
-   Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.
-   Kembali ke [ByteLegend](https://bytelegend.com) dan lanjutkan perjalanan pahlawan Anda.

Semoga berhasil!

Jika Anda memerlukan bantuan, jangan ragu untuk bergabung dengan [Komunitas Discord](https://discord.gg/35RreUUGWt) atau hubungi kami melalui [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Français</summary>

Comprendre l'importance de l'encapsulation en ajoutant des journaux d'audit
---------------------------------------------------------------------------

La classe de `Person` a un champ de `salary` , puisque le salaire est généralement une information sensible, nous voulons que tout code qui accède au champ de `salary` soit enregistré dans le journal pour un audit ultérieur.

Veuillez utiliser `Logger.logAccessToSalaryOfPerson()` pour enregistrer un journal chaque fois que vous accédez au champ de `salary` de la classe `Person` , par exemple :

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Pour le code sans encapsulation, nous devons ajouter des journaux à tous les endroits qui accèdent au champ `salary` . Pour le code avec encapsulation, nous avons seulement besoin de changer l'implémentation de la méthode `getSalary()` - rien d'autre ne doit être changé.

Veuillez apporter la modification aux `com.bytelegend.noencapsulation.Person` (sans encapsulation) et `com.bytelegend.encapsulation.Person` (avec encapsulation) et comprendre l'importance de l'encapsulation : masquer les détails d'implémentation, afin que les nouvelles fonctionnalités à l'avenir ne le soient pas. affecter le code existant. Notez que vous devrez peut-être modifier le code correspondant dans [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) et [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   Vous pouvez accomplir ce défi de n'importe quelle manière ci-dessous:
    -   Recommandé pour les débutants : exécutez `git clone https://github.com/ByteLegendQuest/java-add-audit-log` pour télécharger le code, terminez le défi dans votre IDE local, puis copiez/collez/soumettez la réponse dans l'éditeur Web.
        -   Si vous ne savez pas comment, vous pouvez cliquer sur [importer le projet dans IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [importer le projet dans VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Avant de soumettre votre code, vous feriez mieux d'exécuter `mvn verify` localement pour gagner du temps. Vous ne savez pas comment ? Voir [vérifier localement dans IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [vérifier localement dans VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Très déconseillé : vous pouvez [cliquer ici pour télécharger le code compressé](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) si vous n'aimez pas les opérations `git` .
    -   Ou : si vous êtes suffisamment confiant pour écrire du code directement dans l'éditeur Web, continuez.
    -   Ou : si vous êtes familier avec GitHub, vous pouvez forker [le dépôt](https://github.com/ByteLegendQuest/java-add-audit-log) , terminer le défi et créer une demande d'extraction.
-   Le bot vérifiera votre PR et vous dira si vous accomplissez le défi.
-   Retournez à [ByteLegend](https://bytelegend.com) et continuez votre voyage de héros.

Bonne chance!

Si vous avez besoin d'aide, n'hésitez pas à rejoindre la [communauté Discord](https://discord.gg/35RreUUGWt) ou à nous contacter via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification de fichiers autres que les fichiers suivants sera rejetée :**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>日本語</summary>

監査ログを追加してカプセル化の重要性を理解する
-----------------------

`Person`クラスには`salary`フィールドがあります。給与は通常機密情報であるため、 `salary`フィールドにアクセスするコードはすべて、後で監査するためにログに記録する必要があります。

次のように、 `Person`クラスの`salary`フィールドにアクセスするたびに`Logger.logAccessToSalaryOfPerson()`を使用してログを記録してください。

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

カプセル化されていないコードの場合、 `salary`フィールドにアクセスするすべての場所にログを追加する必要があります。カプセル化されたコードの場合、 `getSalary()`メソッドの実装を変更するだけで済みます。他に変更する必要はありません。

`com.bytelegend.noencapsulation.Person` （カプセル化なし）および`com.bytelegend.encapsulation.Person` （カプセル化あり）クラスに変更を加え、カプセル化の重要性を理解してください：実装の詳細を非表示にして、将来の新機能が機能しないようにします既存のコードに影響します。 [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java)および[`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java)の対応するコードを変更する必要がある場合があることに注意してください。

-   この課題は、以下のいずれかの方法で達成できます。
    -   初心者に推奨： `git clone https://github.com/ByteLegendQuest/java-add-audit-log`を実行してコードをダウンロードし、ローカルIDEでチャレンジを終了してから、Webエディターで回答をコピー/貼り付け/送信します。
        -   方法がわからない場合は、\[ [プロジェクトをIDEAにインポート](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md)\]/\[ [プロジェクトをVSCodeにインポート](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md)\]をクリックできます。
        -   コードを送信する前に、時間を節約するためにローカルで`mvn verify`実行することをお勧めします。方法がわかりませんか？ [IDEAでローカルに](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md)[検証する/VSCodeでローカルに](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md)検証するを参照してください。
    -   非常に推奨されていません`git`操作が気に入らない場合は、 [ここをクリックしてzipコードをダウンロード](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main)できます。
    -   または：Webエディターで直接コードを記述できる自信がある場合は、先に進んでください。
    -   または：GitHubに精通している場合は[、リポジトリ](https://github.com/ByteLegendQuest/java-add-audit-log)をフォークしてチャレンジを終了し、プルリクエストを作成できます。
-   ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。
-   [ByteLegend](https://bytelegend.com)に戻り、ヒーローの旅を続けてください。

幸運を！

ヘルプが必要な場合は、 [Discordコミュニティ](https://discord.gg/35RreUUGWt)に参加するか、contact [@bytelegend.com](mailto:contact@bytelegend.com)からお問い合わせください。

**注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Русский</summary>

Понимание важности инкапсуляции путем добавления журналов аудита
----------------------------------------------------------------

В классе `Person` есть поле `salary` , поскольку оклад обычно является конфиденциальной информацией, мы хотим, чтобы любой код, обращающийся к полю `salary` , был записан в журнал для последующего аудита.

Пожалуйста, используйте `Logger.logAccessToSalaryOfPerson()` для записи журнала всякий раз, когда вы получаете доступ к полю `salary` класса `Person` , например:

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Для кода без инкапсуляции нам нужно добавить логи во все места доступа к полю `salary` . Для кода с инкапсуляцией нужно изменить только реализацию метода `getSalary()` — больше ничего менять не нужно.

Внесите изменения в `com.bytelegend.noencapsulation.Person` (без инкапсуляции) и `com.bytelegend.encapsulation.Person` (с инкапсуляцией) и поймите важность инкапсуляции: сокрытие деталей реализации, чтобы новые функции в будущем не повлиять на существующий код. Обратите внимание, что вам может потребоваться изменить соответствующий код в [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) и [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   Вы можете выполнить эту задачу любым способом, указанным ниже:
    -   Рекомендуется для новичков: запустите `git clone https://github.com/ByteLegendQuest/java-add-audit-log` , чтобы загрузить код, выполните задание в локальной среде IDE, затем скопируйте/вставьте/отправьте ответ в веб-редакторе.
        -   Если вы не знаете как, вы можете нажать [импортировать проект в IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [импортировать проект в VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Перед отправкой кода вам лучше запустить `mvn verify` локально, чтобы сэкономить время. Не знаете как? См. « [Проверить локально в IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [проверить локально в VSCode»](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Крайне не рекомендуется: вы можете [нажать здесь, чтобы загрузить заархивированный код](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) , если вам не нравятся операции `git` .
    -   Или: если вы достаточно уверены, чтобы писать код напрямую в веб-редакторе, вперед.
    -   Или: если вы знакомы с GitHub, вы можете разветвить [репозиторий](https://github.com/ByteLegendQuest/java-add-audit-log) , выполнить задание и создать запрос на включение.
-   Бот проверит ваш PR и сообщит, выполнили ли вы задание.
-   Вернитесь в [ByteLegend](https://bytelegend.com) и продолжайте свое героическое путешествие.

Удачи!

Если вам нужна помощь, присоединяйтесь к [сообществу Discord](https://discord.gg/35RreUUGWt) или свяжитесь с нами по [адресу contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих файлов, будут отклонены:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Deutsch</summary>

Verstehen Sie die Bedeutung der Kapselung durch Hinzufügen von Überwachungsprotokollen
--------------------------------------------------------------------------------------

Die `Person` hat ein `salary` , da es sich beim Gehalt normalerweise um sensible Informationen handelt, möchten wir, dass jeder Code, der auf das `salary` zugreift, im Protokoll zur späteren Prüfung aufgezeichnet wird.

Bitte verwenden Sie `Logger.logAccessToSalaryOfPerson()` , um ein Protokoll aufzuzeichnen, wenn Sie auf das `salary` der `Person` -Klasse zugreifen, zum Beispiel:

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Für den Code ohne Kapselung müssen wir Protokolle zu allen Stellen hinzufügen, die auf das `salary` zugreifen. Für den Code mit Kapselung müssen wir nur die Implementierung der Methode `getSalary()` ändern – sonst muss nichts geändert werden.

Bitte nehmen Sie die Änderung an den `com.bytelegend.noencapsulation.Person` (ohne Kapselung) und `com.bytelegend.encapsulation.Person` (mit Kapselung) vor und verstehen Sie die Bedeutung der Kapselung: Ausblenden von Implementierungsdetails, damit neue Funktionen in der Zukunft nicht vorhanden sind den bestehenden Code beeinflussen. Beachten Sie, dass Sie möglicherweise den entsprechenden Code in [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) und [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) ändern müssen.

-   Sie können diese Herausforderung auf eine der folgenden Arten meistern:
    -   Empfohlen für Anfänger: Führen Sie `git clone https://github.com/ByteLegendQuest/java-add-audit-log` aus, um den Code herunterzuladen, beenden Sie die Herausforderung in Ihrer lokalen IDE und kopieren/fügen Sie dann die Antwort im Web-Editor ein/übermitteln Sie sie.
        -   Wenn Sie nicht wissen wie, können Sie auf [Projekt in IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) [importieren / Projekt in VSCode importieren klicken](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Bevor Sie Ihren Code einreichen, sollten Sie `mvn verify` besser lokal ausführen, um Zeit zu sparen. Sie wissen nicht wie? Siehe [Lokal verifizieren in IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [Lokal verifizieren in VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sehr nicht zu empfehlen: Sie können [hier klicken, um den gezippten Code herunterzuladen,](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) wenn Sie `git` -Operationen nicht mögen.
    -   Oder: Wenn Sie sicher genug sind, Code direkt im Web-Editor zu schreiben, fahren Sie fort.
    -   Oder: Wenn Sie sich mit GitHub auskennen, können Sie [das Repo forken](https://github.com/ByteLegendQuest/java-add-audit-log) , die Challenge beenden und einen Pull-Request erstellen.
-   Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.
-   Gehen Sie zurück zu [ByteLegend](https://bytelegend.com) und setzen Sie Ihre Heldenreise fort.

Viel Glück!

Wenn Sie Hilfe benötigen, können Sie sich gerne der [Discord Community](https://discord.gg/35RreUUGWt) anschließen oder uns über [contact@bytelegend.com kontaktieren](mailto:contact@bytelegend.com) .

**Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an anderen Dateien als den folgenden Dateien werden abgelehnt:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>한국어</summary>

감사 로그를 추가하여 캡슐화의 중요성 이해
-----------------------

`Person` 클래스에는 `salary` 필드가 있습니다. 급여는 일반적으로 민감한 정보이기 때문에 `salary` 필드에 액세스하는 모든 코드가 나중에 감사를 위해 로그에 기록되기를 바랍니다.

`Person` 클래스의 `salary` 필드에 액세스할 때마다 `Logger.logAccessToSalaryOfPerson()` 을 사용하여 로그를 기록하십시오. 예를 들면 다음과 같습니다.

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

캡슐화되지 않은 코드의 경우 `salary` 필드에 액세스하는 모든 위치에 로그를 추가해야 합니다. 캡슐화 코드의 경우 `getSalary()` 메서드의 구현만 변경하면 됩니다. 다른 것은 변경할 필요가 없습니다.

`com.bytelegend.noencapsulation.Person` (비캡슐화) 및 `com.bytelegend.encapsulation.Person` (캡슐화 포함) 클래스를 변경하고 캡슐화의 중요성을 이해하십시오. 구현 세부 정보를 숨기면 미래의 새로운 기능이 사용되지 않습니다. 기존 코드에 영향을 줍니다. [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) 및 [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) 에서 해당 코드를 수정해야 할 수도 있습니다.

-   아래 방법을 통해 이 챌린지를 완료할 수 있습니다.
    -   초보자를 위한 권장 사항: `git clone https://github.com/ByteLegendQuest/java-add-audit-log` 를 실행하여 코드를 다운로드하고 로컬 IDE에서 챌린지를 완료한 다음 웹 편집기에서 답변을 복사/붙여넣기/제출합니다.
        -   방법을 모르는 경우 [프로젝트를 IDEA로](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) [가져오기 / 프로젝트를 VSCode로 가져](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) 오기를 클릭할 수 있습니다.
        -   코드를 제출하기 전에 시간을 절약하기 위해 로컬에서 `mvn verify` 를 실행하는 것이 좋습니다. 방법을 모르십니까? [IDEA에서 로컬로](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) [확인/VSCode에서 로컬로](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) 확인을 참조하세요.
    -   매우 권장하지 않음: `git` 작업이 마음에 들지 않으면 [여기를 클릭하여 압축 코드를 다운로드](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) 할 수 있습니다.
    -   또는 웹 편집기에서 직접 코드를 작성할 만큼 자신이 있다면 계속 진행하십시오.
    -   또는 GitHub에 익숙하다면 리포지토리를 분기 [하고](https://github.com/ByteLegendQuest/java-add-audit-log) 챌린지를 완료하고 풀 요청을 생성할 수 있습니다.
-   봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.
-   [ByteLegend](https://bytelegend.com) 로 돌아가 영웅 여정을 계속하세요.

행운을 빕니다!

도움이 필요하면 언제든지 [Discord 커뮤니티](https://discord.gg/35RreUUGWt) 에 가입하거나 [contact@bytelegend.com](mailto:contact@bytelegend.com) 을 통해 문의하세요.

**참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 변경 사항은 거부됩니다.**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>

<details>
<summary>Italiano</summary>

Comprendere l'importanza dell'incapsulamento aggiungendo registri di controllo
------------------------------------------------------------------------------

La classe `Person` ha un campo `salary` , poiché lo stipendio è solitamente un'informazione sensibile, vogliamo che qualsiasi codice che accede al campo `salary` sia registrato nel registro per un controllo successivo.

Utilizzare `Logger.logAccessToSalaryOfPerson()` per registrare un registro ogni volta che si accede al campo `salary` della classe `Person` , ad esempio:

    int salary = person.salary;
    Logger.logAccessToSalaryOfPerson(person.name);
    

Per il codice senza incapsulamento, dobbiamo aggiungere i log a tutti i luoghi che accedono al campo `salary` . Per il codice con incapsulamento, abbiamo solo bisogno di cambiare l'implementazione del metodo `getSalary()` - nient'altro deve essere cambiato.

Si prega di apportare la modifica alle `com.bytelegend.noencapsulation.Person` (senza incapsulamento) e `com.bytelegend.encapsulation.Person` (con incapsulamento) e comprendere l'importanza dell'incapsulamento: nascondere i dettagli di implementazione, in modo che le nuove funzionalità in futuro non lo facciano influenzare il codice esistente. Tieni presente che potrebbe essere necessario modificare il codice corrispondente in [`com.bytelegend.noencapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/noencapsulation/Utils.java) e [`com.bytelegend.encapsulation.Utils`](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/src/main/java/com/bytelegend/encapsulation/Utils.java) .

-   Puoi portare a termine questa sfida in qualsiasi modo di seguito:
    -   Consigliato per i principianti: esegui `git clone https://github.com/ByteLegendQuest/java-add-audit-log` per scaricare il codice, completa la sfida nel tuo IDE locale, quindi copia/incolla/invia la risposta nell'editor web.
        -   Se non sai come fare, puoi fare clic su [importa progetto in IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import.md) / [importa progetto in VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Prima di inviare il codice, è meglio eseguire `mvn verify` in locale per risparmiare tempo. Non sai come? Vedere [verifica in locale in IDEA](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-idea.md) / [verifica in locale in VSCode](https://github.com/ByteLegendQuest/java-add-audit-log/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Molto sconsigliato: puoi fare [clic qui per scaricare il codice zippato](https://codeload.github.com/ByteLegendQuest/java-add-audit-log/zip/refs/heads/main) se non ti piacciono le operazioni `git` .
    -   Oppure: se sei abbastanza sicuro da scrivere il codice direttamente nell'editor web, vai avanti.
    -   Oppure: se hai familiarità con GitHub, puoi eseguire il fork [del repository](https://github.com/ByteLegendQuest/java-add-audit-log) , completare la sfida e creare una richiesta pull.
-   Il bot controllerà il tuo PR e ti dirà se hai superato la sfida.
-   Torna a [ByteLegend](https://bytelegend.com) e continua il tuo viaggio da eroe.

In bocca al lupo!

Se hai bisogno di aiuto, non esitare a unirti alla [community di Discord](https://discord.gg/35RreUUGWt) o contattaci tramite [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: ti permettiamo solo di modificare i seguenti file. Eventuali modifiche ai file diversi dai seguenti file verranno rifiutate:**

-   `src/main/java/com/bytelegend/encapsulation/`
-   `src/main/java/com/bytelegend/noencapsulation/`
</details>
