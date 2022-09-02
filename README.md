# Azure Key Vault

1. Acesse https://portal.azure.com/

<img width="828" alt="Captura de tela 2022-09-02 093919" src="https://user-images.githubusercontent.com/48317736/188150486-385f0aa8-7d80-432a-b6e4-8538721c1466.png">

2. Digite Grupo De Recursos na barra de pesquisa e o selecione

<img width="830" alt="Captura de tela 2022-09-02 093950" src="https://user-images.githubusercontent.com/48317736/188150585-9cf15f9a-1dac-4e27-8796-47c35008d872.png">

3. Clique em Criar

<img width="826" alt="Captura de tela 2022-09-02 094300" src="https://user-images.githubusercontent.com/48317736/188150682-6a6750ee-909d-4c09-b502-9ff0779220c4.png">

4. Assinatura -> Ex: Tools Software PAYG
5. Grupo de recursos -> Ex: RG-VAULT-DEMO
6. Região -> Ex: (US) East US 2
7. Clique Revisar + Criar

<img width="326" alt="Captura de tela 2022-09-02 100058" src="https://user-images.githubusercontent.com/48317736/188151399-542e1ba8-4c37-4ecf-af45-16b1c71b9332.png">

8. Clique em Criar

<img width="269" alt="Captura de tela 2022-09-02 100153" src="https://user-images.githubusercontent.com/48317736/188151567-9621f47c-ad13-41b8-8334-3644350472e8.png">

9. Clique em Atualizar

<img width="530" alt="Captura de tela 2022-09-02 100231" src="https://user-images.githubusercontent.com/48317736/188151681-c9c2dcdd-e298-4ea6-ae62-78012a10406b.png">

10. Selecione RG-VAULT-DEMO

<img width="703" alt="Captura de tela 2022-09-02 095319" src="https://user-images.githubusercontent.com/48317736/188150705-94eeb03b-4ea9-45c0-81bf-1508e8169efe.png">

11. Digite Cofres De Chaves na barra de pesquisa e o selecione

<img width="796" alt="Captura de tela 2022-09-02 095445" src="https://user-images.githubusercontent.com/48317736/188150933-8b1f1594-ddff-4ffa-a663-9a8ff964d444.png">

12. Clique em Criar

<img width="637" alt="Captura de tela 2022-09-02 110613" src="https://user-images.githubusercontent.com/48317736/188167812-2246ffed-56b3-4978-8420-d81436fed43c.png">

13. Assinatura -> Ex: Tools Software PAYG
14. Grupo de recursos ->  RG-VAULT-DEMO
15. Nome do cofre de chaves -> Ex: KV-DEMO-TESTE
16. Região -> Ex: (US) East US 2
17. Dias os cofres excluídos devem ser retidos -> Ex: 90
18. Clique Revisar + Criar

<img width="345" alt="Captura de tela 2022-09-02 110719" src="https://user-images.githubusercontent.com/48317736/188167829-aa9d6dfa-b73e-4ac4-895f-ea760c8540f8.png">

19. Clique em Criar

<img width="433" alt="Captura de tela 2022-09-02 111127" src="https://user-images.githubusercontent.com/48317736/188167826-6a6ca3dc-16c8-403c-b874-00b3942b9d0c.png">

<img width="1229" alt="Captura de tela 2022-09-02 112120" src="https://user-images.githubusercontent.com/48317736/188170879-12986939-ea8f-4de4-999a-62d469810217.png">

20. Clique em Ir para o recurso

<img width="1072" alt="Captura de tela 2022-09-02 112144" src="https://user-images.githubusercontent.com/48317736/188170918-6a5d1975-273e-4b3b-9de5-8cbd9475dded.png">

21. Anote o endpoint -> URI do cofre: https://kv-demo-teste.vault.azure.net/
22. Anote o tecent id -> ID do diretório: 6ca08334-8361-42a5-addb-6bd657abd14e

<img width="1459" alt="Captura de tela 2022-09-02 112211" src="https://user-images.githubusercontent.com/48317736/188171023-74ff9228-8973-4506-8828-31543f2f682b.png">

23. Clique em Políticas de Acesso

24. Clique em Adicionar Política de Acesso

<img width="1292" alt="Captura de tela 2022-09-02 112315" src="https://user-images.githubusercontent.com/48317736/188202319-a4f81b7e-1661-4023-996c-5bf9388d6eff.png">

25. Configurar usando o modelo ->  Gerenciamento de Segredos e Chaves
26. Permissões de chave -> Ex: 12
27. Permissões do segredo -> Ex: 7 
28. Permissões de certiifcado -> Ex: 0
29. Selecionar a entidade de segurança -> Ex: Euller Henrique Bandeira Oliveira
30. Clieque em Adicionar

<img width="1458" alt="Captura de tela 2022-09-02 112407" src="https://user-images.githubusercontent.com/48317736/188202317-036835e6-b2a0-4f46-b962-50c742f4593b.png">

31. Clique em Salvar

<img width="837" alt="Captura de tela 2022-09-02 143646" src="https://user-images.githubusercontent.com/48317736/188208170-e1ca5c52-790d-49ee-ae5d-4e0ba42b1706.png">
<img width="834" alt="Captura de tela 2022-09-02 143831" src="https://user-images.githubusercontent.com/48317736/188208251-113077d0-e853-4f97-afdd-1e1c0226eb5d.png">

32. Clique em IAM (Controle de acesso)

<img width="613" alt="Captura de tela 2022-09-02 141518" src="https://user-images.githubusercontent.com/48317736/188210283-431db8c5-33bf-475f-a4b9-26fdb1cf749c.png">

33. Clique em Adicionar Atribuição De Função

<img width="743" alt="Captura de tela 2022-09-02 141912" src="https://user-images.githubusercontent.com/48317736/188210845-07f9c28c-e1dc-4501-b455-5f43f2137b0f.png">

34. Clique em Administrador de Cofre de Chaves

<img width="743" alt="Captura de tela 2022-09-02 141912" src="https://user-images.githubusercontent.com/48317736/188210845-07f9c28c-e1dc-4501-b455-5f43f2137b0f.png">

35. Selecionar membros -> Ex: Euller Henrique Bandeira Oliveira

<img width="836" alt="Captura de tela 2022-09-02 142030" src="https://user-images.githubusercontent.com/48317736/188210905-b51c94bd-16b5-4682-a117-08f4e5d984f1.png">

36. Clique em Examinar + atribuir

<img width="527" alt="Captura de tela 2022-09-02 142517" src="https://user-images.githubusercontent.com/48317736/188211429-3851e1bd-da1c-4cec-83a3-63d02a9f6588.png">

37. Clique em Examinar + atribuir

<img width="452" alt="Captura de tela 2022-09-02 142532" src="https://user-images.githubusercontent.com/48317736/188211521-99031ac2-ac64-4516-a79b-2b744ea71e7b.png">

38. Clique em Contribuidor

<img width="737" alt="Captura de tela 2022-09-02 142349" src="https://user-images.githubusercontent.com/48317736/188212235-e8f26d28-58db-4d2e-a3d5-666f8443ed44.png">

39. Selecionar membros -> Ex: Euller Henrique Bandeira Oliveira

<img width="837" alt="Captura de tela 2022-09-02 142459" src="https://user-images.githubusercontent.com/48317736/188212238-3f0075df-06af-4be5-8c86-0d7bc51f66a1.png">

40. Clique em Examinar + atribuir

<img width="527" alt="Captura de tela 2022-09-02 142517" src="https://user-images.githubusercontent.com/48317736/188212244-bdb369d3-eb4b-4157-a647-a38cd8471f10.png">

41. Clique em Examinar + atribuir

<img width="452" alt="Captura de tela 2022-09-02 142532" src="https://user-images.githubusercontent.com/48317736/188212339-11b7469d-309a-4099-848f-156554296125.png">

42. Digite Azure Active Directory na barra de pesquisa e o selecione

<img width="814" alt="Captura de tela 2022-09-02 152853" src="https://user-images.githubusercontent.com/48317736/188215971-4bc0bc41-ad31-4fc5-b169-3778db840de0.png">

43. Selecione Registros de Aplicativos

<img width="116" alt="Captura de tela 2022-09-02 153136" src="https://user-images.githubusercontent.com/48317736/188216290-36a3fee1-367f-4052-85f3-1d89b3b1aa07.png">

44. Clique em Novo Registro

<img width="559" alt="Captura de tela 2022-09-02 153314" src="https://user-images.githubusercontent.com/48317736/188216625-f6ea910c-bd65-4e02-a36d-e42a8f156730.png">

45. Nome -> Ex: app-key-sat-dsv

46. Clique em Registrar

<img width="475" alt="Captura de tela 2022-09-02 153637" src="https://user-images.githubusercontent.com/48317736/188217089-e6109112-c234-4422-9713-8074da40d711.png">

47. Anote o client id -> Id do Aplicativo (cliente): 51c8e300-fbcd-4658-b5a4-ad34fde06b8b

<img width="837" alt="Captura de tela 2022-09-02 153703" src="https://user-images.githubusercontent.com/48317736/188217106-f83ad5ba-39e3-4be2-ba4a-421721aeb9ec.png">

48. Clique em Certificados e Segredos

<img width="623" alt="Captura de tela 2022-09-02 153954" src="https://user-images.githubusercontent.com/48317736/188217704-b44437c0-17f7-4f6e-bcce-aa3f3917f069.png">

49. Clique em Novo segredo de cliente
50. Descrição -> Ex: pass-key-dsv

<img width="836" alt="Captura de tela 2022-09-02 154101" src="https://user-images.githubusercontent.com/48317736/188217732-f2d81ffa-2c4d-4497-86b9-4fe12de9bfcc.png">

51. Anote o client secret -> Value: mP88Q~wtOsRwDFfSy7C16BtpVbWYA9GhI5Vgeaql

<img width="567" alt="Captura de tela 2022-09-02 154136" src="https://user-images.githubusercontent.com/48317736/188217913-5d0c17d8-fd3a-4b03-b07e-f8a04cb72b3a.png">

52. Digite Cofres De Chaves na barra de pesquisa e o selecione

<img width="796" alt="Captura de tela 2022-09-02 095445" src="https://user-images.githubusercontent.com/48317736/188150933-8b1f1594-ddff-4ffa-a663-9a8ff964d444.png">

53.Clique em kv-demo-teste

<img width="801" alt="Captura de tela 2022-09-02 154718" src="https://user-images.githubusercontent.com/48317736/188218471-9b99d5f5-8fe4-4cff-a4b3-10cc9ff5fd0f.png">

54. Clique em Políticas de Acesso
55. Clique em Adicionar Política de Acesso

<img width="1292" alt="Captura de tela 2022-09-02 112315" src="https://user-images.githubusercontent.com/48317736/188202319-a4f81b7e-1661-4023-996c-5bf9388d6eff.png">

56. Configurar usando o modelo ->  Gerenciamento de Segredos e Chaves
57. Permissões de chave -> Ex: 0
58. Permissões do segredo -> Ex: 2 -> Obter e Listar  
59. Permissões de certiifcado -> Ex: 0
60. Selecionar a entidade de segurança -> app-key-sat-dsv
61. Clieque em Adicionar

<img width="349" alt="Captura de tela 2022-09-02 155204" src="https://user-images.githubusercontent.com/48317736/188219187-acd03730-c63c-4e2f-b2bd-e26e9c1c10b2.png">

62. Clique em Salvar

<img width="835" alt="Captura de tela 2022-09-02 155228" src="https://user-images.githubusercontent.com/48317736/188219193-470ed9e3-325c-45ba-83b9-2c90602fe881.png">
<img width="836" alt="Captura de tela 2022-09-02 155305" src="https://user-images.githubusercontent.com/48317736/188219198-699410a5-641c-4f90-b720-bbc8bb9e5bd3.png">

63. Clique em Em Rede

<img width="605" alt="Captura de tela 2022-09-02 155600" src="https://user-images.githubusercontent.com/48317736/188219765-b8f3083f-b5c6-4806-9d53-460dbe59f9db.png">

64. Clique Em Redes Selecionadas
65. Adicione redes virtuais ou/e os ips dos usuários que poderão consumir os secrets do keyvault

<img width="837" alt="Captura de tela 2022-09-02 155717" src="https://user-images.githubusercontent.com/48317736/188219772-f86ee499-5f11-4eed-aeb5-2df0ad9a1351.png">

66. Clique em Segredos

<img width="959" alt="Captura de tela 2022-09-02 160551" src="https://user-images.githubusercontent.com/48317736/188221149-295d6cd9-476e-4746-b0c8-aaa17275274d.png">

67. Clique em Gerar/Importar

<img width="487" alt="Captura de tela 2022-09-02 160717" src="https://user-images.githubusercontent.com/48317736/188221151-7b07c76d-9f52-48d2-9ed0-fd6058e0005e.png">

68. Nome -> Ex: urlBd
69. Valor Secreto -> Ex: jdbc:sqlserver://SERVER.database.windows.net:1433;database=DATABASE;

<img width="487" alt="Captura de tela 2022-09-02 160717" src="https://user-images.githubusercontent.com/48317736/188221151-7b07c76d-9f52-48d2-9ed0-fd6058e0005e.png">

<img width="954" alt="Captura de tela 2022-09-02 160923" src="https://user-images.githubusercontent.com/48317736/188221408-f9296877-6084-44c2-afdd-38b6688cd69e.png">











                                                 


