<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>list 작성 페이지</h1>

<form method="POST">

    <div>
    <span>제목</span>
        <div>
            <input type="text" name="title" maxlength="50" placeholder="제목을 입력해주세요."/>
        </div>
    </div>

    <div>
        <span>내용</span>
        <div>
            <input type="text" name="body" maxlength="200" placeholder="내용을 입력해주세요."/>
        </div>
    </div>

    <div>
        <div>
            <input type="submit" value="작성" />
        </div>
    </div>

</form>