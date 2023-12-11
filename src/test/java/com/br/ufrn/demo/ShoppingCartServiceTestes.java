package com.br.ufrn.demo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.br.ufrn.demo.ShoppingCartServiceTesteUmProdutoApplicationTests;
import com.br.ufrn.demo.ShoppingCartServiceTesteCincoProdutosApplicationTests;
import com.br.ufrn.demo.ShoppingCartServiceTesteCincoProdutosComRepeticaoApplicationTests;

// Add the missing JUnit dependencies to your project's build configuration file

@Suite
@SelectClasses({
                ShoppingCartServiceTesteUmProdutoApplicationTests.class,
                ShoppingCartServiceTesteCincoProdutosApplicationTests.class,
                ShoppingCartServiceTesteCincoProdutosComRepeticaoApplicationTests.class
})
public class ShoppingCartServiceTestes {
}
