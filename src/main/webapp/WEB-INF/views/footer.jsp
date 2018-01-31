<%@ page contentType="text/html;charset=UTF-8"%>
            <footer>
                copyright &copy; 2018 СамараНИПИНефть
            </footer>
        </div> <%--Close container--%>
    </div> <%--Close container-fliud--%>
    <spring:url value="/resources/js/jquery-3.3.1.js" var="jquery" />
    <spring:url value="/resources/js/popper.js" var="popper" />
    <spring:url value="/resources/js/bootstrap.js" var="bsjs" />
    <script src="${jquery}"></script>
    <script src="${popper}"></script>
    <script src="${bsjs}"></script>
</body>
</html>
