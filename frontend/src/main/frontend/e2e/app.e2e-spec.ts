import { SpringBootPage } from './app.po';

describe('spring-boot App', () => {
  let page: SpringBootPage;

  beforeEach(() => {
    page = new SpringBootPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
