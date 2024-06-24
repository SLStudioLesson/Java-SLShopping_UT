package com.example.slshopping_ut.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    /** モック化したクラス */
    @Mock
    private UserService mockUserService;

    /** テスト対象クラスにモックを注入 */
    @InjectMocks
    private UserController target;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {

    }

    /**
     * 【概要】
     * 管理者一覧表示画面の検証<br>
     *
     * 【条件】
     * GET通信の/usersにリクエストすること<br>
     * クエリパラメーターkeywordにはnullを入力すること<br>
     * userServiceのfindAllメソッドは管理者のリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * users/users.htmlを表示すること<br>
     * キー名listUsersに管理者のリストが格納されていること<br>
     * キー名keywordにnullが格納されていること
     */
    @Test
    void testListUsers() throws Exception {


    }

    /**
     * 【概要】
     * 管理者新規登録画面の検証<br>
     *
     * 【条件】
     * GET通信の/users/newにリクエストすること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * users/user_form.htmlを表示すること<br>
     * キー名userにUserのインスタンスが格納されていること
     */
    @Test
    void testNewUser() throws Exception {

    }

    /**
     * 【概要】
     * 管理者新規登録処理の検証
     *
     * 【条件】
     * POST通信の/users/saveにリクエストすること<br>
     * バリデーションを通過する値をパラメーターにすること<br>
     * userServiceのcheckUniqueメソッドはtrueを返却するようスタブ化すること<br>
     * userServiceのsaveメソッドはUserのインスタンスを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが302であること<br>
     * /usersにリダイレクトしていること<br>
     * リダイレクト先にキー名success_messageに「登録に成功しました」という文字列が格納されていること
     */
    @Test
    void testNewUserForm() throws Exception {

    }

    /**
     * 【概要】
     * 管理者詳細画面の検証<br>
     *
     * 【条件】
     * GET通信の/users/detail/1にリクエストすること<br>
     * userServiceのgetメソッドはID1LのUserを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * users/user_detail.htmlを表示すること<br>
     * キー名userにID1LのUserが格納されていること
     */
    @Test
    void testDetailUser() throws Exception {

    }

    /**
     * 【概要】
     * 管理者編集画面の検証<br>
     *
     * 【条件】
     * GET通信の/users/edit/1にリクエストすること<br>
     * userServiceのgetメソッドがID1LのUserを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * users/user_edit.htmlを表示すること<br>
     * キー名userにID1LのUserが格納されていること
     */
    @Test
    void testEditUserForm() throws Exception {

    }

    /**
     * 【概要】
     * 管理者編集処理の検証
     *
     * 【条件】
     * POST通信の/users/edit/1にリクエストすること<br>
     * バリデーションを通過する値をパラメーターにすること<br>
     * userServiceのcheckUniqueメソッドはtrueを返却するようスタブ化すること<br>
     * userServiceのsaveメソッドはUserのインスタンスを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが302であること<br>
     * /usersにリダイレクトしていること<br>
     * リダイレクト先にキー名success_messageに「更新に成功しました」という文字列が格納されていること
     */
    @Test
    void testEditProduct() throws Exception {

    }
}
