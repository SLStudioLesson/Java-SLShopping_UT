package com.example.slshopping_ut.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.slshopping_ut.brand.BrandService;
import com.example.slshopping_ut.category.CategoryService;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    /** モック化したクラス */
    @Mock
    private ProductService mockProductService;

    @Mock
    private BrandService mockBrandService;

    @Mock
    private CategoryService mockCategoryService;

    @Mock
    private ProductImageService mockProductImageService;

    /** テスト対象クラスにモックを注入 */
    @InjectMocks
    private ProductController target;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {

    }

    /**
     * 【概要】
     * 商品一覧表示画面の検証<br>
     *
     * 【条件】
     * GET通信の/productsにリクエストすること<br>
     * クエリパラメーターkeywordにはnullを入力すること<br>
     * productServiceのfindAllメソッドは商品のリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * products/products.htmlを表示すること<br>
     * キー名listProductsに商品のリストが格納されていること<br>
     * キー名keywordにnullが格納されていること
     */
    @Test
    void testListProducts() throws Exception {

    }

    /**
     * 【概要】
     * 商品新規登録画面の検証<br>
     *
     * 【条件】
     * GET通信の/products/newにリクエストすること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * products/product_form.htmlを表示すること<br>
     * キー名productにProductのインスタンスが格納されていること
     */
    @Test
    void testNewProduct() throws Exception {

    }

    /**
     * 【概要】
     * 商品新規登録処理の検証
     *
     * 【条件】
     * POST通信の/products/saveにリクエストすること<br>
     * バリデーションを通過する値をパラメーターにすること<br>
     * productImageServiceのisValidメソッドはtrueを返却するようスタブ化すること<br>
     * productServiceのcheckUniqueメソッドはtrueを返却するようスタブ化すること<br>
     * productsServiceのsaveメソッドはProductのインスタンスを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが302であること<br>
     * /productsにリダイレクトしていること<br>
     * リダイレクト先にキー名success_messageに「登録に成功しました」という文字列が格納されていること
     */
    @Test
    void testSaveProduct() throws Exception {

    }

    /**
     * 【概要】
     * 商品詳細画面の検証<br>
     *
     * 【条件】
     * GET通信の/products/detail/1にリクエストすること<br>
     * productServiceのgetメソッドはID1LのProductを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * products/product_detail.htmlを表示すること<br>
     * キー名productにID1LのProductが格納されていること
     */
    @Test
    void testDetailProduct() throws Exception {

    }

    /**
     * 【概要】
     * 商品編集画面の検証<br>
     *
     * 【条件】
     * GET通信の/products/edit/1にリクエストすること<br>
     * productServiceのgetメソッドがID1LのProductを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが200であること<br>
     * products/product_edit.htmlを表示すること<br>
     * キー名productにID1LのProductが格納されていること
     */
    @Test
    void testEditProductForm() throws Exception {

    }

    /**
     * 【概要】
     * 商品更新処理の検証
     *
     * 【条件】
     * POST通信の/products/edit/1にリクエストすること<br>
     * バリデーションを通過する値をパラメーターにすること<br>
     * productImageServiceのisValidメソッドはtrueを返却するようスタブ化すること<br>
     * productServiceのcheckUniqueメソッドはtrueを返却するようスタブ化すること<br>
     * productsServiceのsaveメソッドはProductのインスタンスを返却するようスタブ化すること<br>
     *
     * 【結果】
     * ステータスが302であること<br>
     * /productsにリダイレクトしていること<br>
     * リダイレクト先にキー名success_messageに「更新に成功しました」という文字列が格納されていること
     */
    @Test
    void testEditProduct() throws Exception {

    }

    /**
     * 【概要】
     * 商品削除処理の検証<br>
     *
     * 【条件】
     * GET通信の/products/delete/1にリクエストすること<br>
     *
     * 【結果】
     * ステータスが302であること<br>
     * /productsにリダイレクトしていること<br>
     * リダイレクト先にキー名success_messageに「削除に成功しました」という文字列が格納されていること
     */
    @Test
    void testDeleteProduct() throws Exception {

    }
}
